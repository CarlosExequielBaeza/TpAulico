/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpaul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Baraja {
    private List<Carta> cartas;
    private List<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<Carta>();
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
                for (Palo palo : Palo.values()) {
                    this.cartas.add(new Carta(i, palo));
                }
            }
        }

        System.out.println(
                "------------------------\n" +
                        "Baraja creada con exito.\n" +
                        "------------------------\n");
        monton= new ArrayList<>();
        
    }

    public void barajar() {
        Collections.shuffle(this.cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.size() <= 0) {
            System.out.println("No hay cartas en la baraja");
            return null;
        }
        return cartas.remove(cartas.size() - 1);
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan "+(cartas.size())+" disponibles en la baraja");
        System.out.println("--------------------------------------------------------------------");
    }
    
   public void darCartas (int cantidad) {
       if (cantidad > cartas.size()) {
           System.out.println("No tienes la cantidad suficiente para entregar las cartas!!!");
       }else{
           for (int i = 0; i < cantidad ; i++) {
               monton.add(siguienteCarta());
           }
       }
    }
   
  public void cartasMonton() {
    if (monton.isEmpty()) {
        System.out.println("No se han entregado cartas aún.");
    } else {
        System.out.println("Se entregaron las siguientes cartas :");
        int contador = 1;
        for (int i = 0; i < monton.size(); i++) {
            System.out.print(contador+" - ");
            System.out.println(monton.get(i));
            contador ++;
        }
    }
      System.out.println("-----------------------------------------------------------------");
}
    public void mostrarBaraja() {
        int contador=1;
        for (Carta carta : cartas) {
            System.out.print(contador+" - ");
            System.out.println(carta.toString());
            contador ++;
        }
        System.out.println("---------------------------------------------------------------------");
    }
    
}
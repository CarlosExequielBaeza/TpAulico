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
    
  private List <Carta> cartas;
  private int cantCartasEntregadas;
  private List <Carta> monton;

    public Baraja(int canCartasEntregadas ) {
        cartas= new ArrayList<>();
        monton= new ArrayList<>();
        this.cantCartasEntregadas= cantCartasEntregadas;
    }
    

    public int getCantCartasEntregadas() {
        return cantCartasEntregadas;
    }

    public void setCantCartasEntregadas(int cantCartasEntregadas) {
        this.cantCartasEntregadas = cantCartasEntregadas;
    }
    public void inicializarBaraja(){
        final String[] palos={"Oro","Basto","Espada","Copa"};
        for (int i = 1; i <= 12; i++) {
            if ( i != 8 && i !=9) {
                
            }
        }
    }
  
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public void siguienteCarta(){
        
    }
    //comentario
}

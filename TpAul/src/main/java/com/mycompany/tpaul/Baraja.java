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
    private int cantCartasEntregadas;
    private List<Carta> monton;

    public Baraja() {
        this.cartas = new ArrayList<Carta>();
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
    }

    public int getCantCartasEntregadas() {
        return cantCartasEntregadas;
    }

    public void setCantCartasEntregadas(int cantCartasEntregadas) {
        this.cantCartasEntregadas = cantCartasEntregadas;
    }

    public void barajar() {
        Collections.shuffle(this.cartas);
        this.cantCartasEntregadas = 0;
    }

    public void siguienteCarta() {

    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta.toString());
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpaul;

import java.util.ArrayList;
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
  
  
  
    
}

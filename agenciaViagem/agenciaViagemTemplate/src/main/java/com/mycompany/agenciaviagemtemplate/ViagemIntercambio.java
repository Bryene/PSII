/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaviagemtemplate;

public class ViagemIntercambio extends Viagem {

    @Override
    public void dia1() {
        System.out.println("Dia 1: Visitar lojas.");
    }

    @Override
    public void dia2() {
        System.out.println("Dia 2: Alugar apartamento e conhecer a cidade.");
    }

    @Override
    public void dia3() {
        System.out.println("Dia 3: Visitar outras cidades.");
    }
    
}

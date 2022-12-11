/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaviagemtemplate;
public class ViagemCampestre extends Viagem {

    @Override
    public void dia1() {
        System.out.println("Dia 1: Visitar o rio para pescar.");
    }

    @Override
    public void dia2() {
        System.out.println("Dia 2: Fazer trilha até a montanha.");
    }

    @Override
    public void dia3() {
        System.out.println("Dia 3: Colher frutas.");
    }
    
}

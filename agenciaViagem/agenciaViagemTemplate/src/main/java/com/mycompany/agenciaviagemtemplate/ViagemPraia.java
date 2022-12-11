/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaviagemtemplate;

public class ViagemPraia extends Viagem {

    @Override
    public void dia1() {
        System.out.println("Dia 1: Trilha até a praia, e curtir a praia.");
    }

    @Override
    public void dia2() {
        System.out.println("Dia 2: Viagem de barco até uma praia distante.");
    }

    @Override
    public void dia3() {
        System.out.println("Dia 3: Passeio de banana boat. ");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaviagemtemplate;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        AgenciaViagem av1 = new AgenciaViagem();
        av1.setViagem("Praia");
        av1.organizar_viagem();
        AgenciaViagem av2 = new AgenciaViagem();
        av2.setViagem("Campestre");
        av2.organizar_viagem();
        AgenciaViagem av3 = new AgenciaViagem();
        av3.setViagem("Historica");
        av3.organizar_viagem();
        AgenciaViagem av4 = new AgenciaViagem();
        av4.setViagem("Intercambio");
        av4.organizar_viagem();
    }
    
}

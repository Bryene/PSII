/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaviagemtemplate;

public abstract class Viagem {
    
    public abstract void dia1();
    
    public abstract void dia2();
    
    public abstract void dia3();
    
    public void organizar_viagem(){
        dia1();
        dia2();
        dia3();
    }
    
}

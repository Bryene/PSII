/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaviagemtemplate;
public class AgenciaViagem {
    public Viagem viagem; 
    
    public void organizar_viagem(){
        viagem.organizar_viagem();
    }
    
    public void setViagem(String tipo){
        if(tipo == "Praia"){
            this.viagem = new ViagemPraia();
        }
        else if(tipo == "Campestre"){
            this.viagem = new ViagemCampestre();
        }
        else if(tipo == "Historica"){
            this.viagem = new ViagemHistorica();
        }
        else if(tipo == "Intercambio"){
            this.viagem = new ViagemIntercambio();
        }
    }
}

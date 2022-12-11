/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventofacade;

import alimentacao.Alimentacao;
import florista.Florista;
import hotel.Hotel;
import musica.Musica;

/**

 @author vitor
 */
public class OrganizadorEvento {
    Alimentacao alimentacao;
    Florista florista;
    Hotel hotel;
    Musica musica;
    
    public OrganizadorEvento(){
        this.alimentacao = new Alimentacao();
        this.florista = new Florista();
        this.hotel = new Hotel();
        this.musica = new Musica();
        
    }
    
    public void realizar(){
        this.alimentacao.evento();
        this.florista.evento();
        this.hotel.evento();
        this.musica.evento();
    }
}

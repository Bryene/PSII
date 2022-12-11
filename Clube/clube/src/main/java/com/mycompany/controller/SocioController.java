/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Socio;
import com.mycompany.view.SocioView;
import java.util.ArrayList;

public class SocioController {
    public ArrayList<SocioView> socios = new ArrayList<>();
    public Socio socio;

    public SocioController() {
        this.socio = new Socio();
        this.socios.add(new SocioView(this));
    }
    
    public void novo_socios(){
        this.socios.add(new SocioView(this));
    }
    
    public long socio_getCartao_socio(){
        return (this.socio.getCartao_socio());
    }
    
    public void socio_setCartao_socio(long cartao_socio){
        this.socio.setCartao_socio(cartao_socio);
    }
    
    public String socio_getNome_socio(){
        return (this.socio.getNome_socio());
    }
    
    public void socio_setNome_socio(String nome_socio){
        this.socio.setNome_socio(nome_socio);
    }
    
    public String socio_getEnd_socio(){
        return (this.socio.getEnd_socio());
    }
    
    public void socio_setEnde_socio(String end_socio){
        this.socio.setEnd_socio(end_socio);
    }
    
    public String socio_getTel_socio(){
        return (this.socio.getTel_socio());
    }
    
    public void socio_setTel_socio(String tel_socio){
        this.socio.setTel_socio(tel_socio);
    }
    
    public String socio_getEmail_socio(){
        return (this.socio.getEmail_socio());
    }
    
    public void socio_setEmail_socio(String email_socio){
        this.socio.setEmail_socio(email_socio);
    }
}

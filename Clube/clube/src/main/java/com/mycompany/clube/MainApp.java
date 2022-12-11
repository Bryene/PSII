/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clube;

import com.mycompany.controller.SocioController;


public class MainApp {

    public static void main(String[] args) {

        
        SocioController sc1 = new SocioController();
        
        sc1.socio.setNome_socio("Claudio Luis");
        sc1.socio.setCartao_socio(11111);
        sc1.socio.setTel_socio("2222222222222");
        
        sc1.socios.get(0).socio_getNome_socio();
        sc1.socios.get(0).socio_getCartao_socio();
        sc1.socios.get(0).socio_getTel_socio();
    }   
}

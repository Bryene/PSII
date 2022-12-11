/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;
import com.mycompany.controller.SocioController;

public class SocioView {
    static int count = 0;
    public SocioController socioC;
    
    public SocioView(SocioController socio){
        count += 1;
        this.socioC = socio;
    }
    
    public void socio_getCartao_socio(){
        System.out.println("O número do cartão do sócio é: " + this.socioC.socio_getCartao_socio());
    }
    
    public void socio_getNome_socio(){
         System.out.println("O nome do sócio é: " + this.socioC.socio_getNome_socio());
    }
    
    public void socio_getEnd_socio(){
         System.out.println("O endereço do sócio é: " + this.socioC.socio_getEnd_socio());
    }
    
    public void socio_getTel_socio(){
         System.out.println("O telefone do sócio é: " + this.socioC.socio_getTel_socio());
    }
    
    public void socio_getEmail_socio(){
         System.out.println("O E-mail do sócio é: " + this.socioC.socio_getEmail_socio());
    }
}

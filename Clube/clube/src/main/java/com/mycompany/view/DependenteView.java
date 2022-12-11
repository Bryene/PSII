/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.controller.DependenteController;

public class DependenteView {
    static int count = 0;
    public DependenteController dependenteC;
    
    public DependenteView(DependenteController dependente){
        count += 1;
        this.dependenteC = dependente;
    }
    
    public void dependente_getCartao_dep(){
        System.out.println("O número do cartão do Dependente é: " + this.dependenteC.dependente_getCartao_dep());
    }
    
    public void dependente_getNome_dep(){
        System.out.println("O nome do dependete é: " + this.dependenteC.dependente_getNome_dep());
    }
    
    public void dependente_getParentesco(){
        System.out.println("O parentesco desse dependete é: " + this.dependenteC.dependente_getParentesco());
    }
    
    public void dependente_getEmail(){
        System.out.println("O email do dependente é: " + this.dependenteC.dependente_getEmail_dep() );
    }
}

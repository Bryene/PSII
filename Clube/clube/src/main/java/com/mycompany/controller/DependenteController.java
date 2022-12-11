/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Dependente;
import com.mycompany.view.DependenteView;
import java.util.ArrayList;

public class DependenteController {
    public ArrayList<DependenteView> depedentes = new ArrayList<>();
    public Dependente dependente;
    
    public DependenteController(){
        this.dependente = new Dependente();
        this.depedentes.add(new DependenteView(this));
        
    }
    
    public void nova_dependentes(){
        this.depedentes.add(new DependenteView(this));
    }
    
    public long dependente_getCartao_dep(){
        return(this.dependente.getCartao_dep());
    }
    
    public void dependente_setCartao_dep(long cartao_dep){
        this.dependente.setCartao_dep(cartao_dep);
    }
    
    public String dependente_getNome_dep(){
        return(this.dependente.getNom_dep());
    }
    
    public void dependente_setNome_dep(String nom_dep){
        this.dependente.setNom_dep(nom_dep);
    }
    
    public String dependente_getParentesco(){
        return(this.dependente.getParentesco());
    }
    
    public void dependete_setParentesco(String parentesco){
        this.dependente.setParentesco(parentesco);
    }
    
    public String dependente_getEmail_dep(){
        return(this.dependente.getEmail_dep());
    }
    
    public void dependente_setEmail_dep(String email_dep){
        this.dependente.setEmail_dep(email_dep);
    }
}

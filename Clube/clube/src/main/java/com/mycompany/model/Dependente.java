/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

public class Dependente {
    private long cartao_dep;
    private String nom_dep;
    private String parentesco;
    private String email_dep;

    public long getCartao_dep() {
        return cartao_dep;
    }

    public void setCartao_dep(long cartao_dep) {
        this.cartao_dep = cartao_dep;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEmail_dep() {
        return email_dep;
    }

    public void setEmail_dep(String email_dep) {
        this.email_dep = email_dep;
    }
    
    public long regDep(){
        Dependente dependente = new Dependente();
        long n= getCartao_dep();
        dependente.setCartao_dep(n);
        return n;
    }
}

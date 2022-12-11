/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;
import com.mycompany.model.Categoria;
import com.mycompany.view.CategoriaView;
import java.util.ArrayList;


public class CategoriaController {
    public ArrayList<CategoriaView> catergorias = new ArrayList<>();
    public Categoria categoria;

    public CategoriaController() {
        this.categoria = new Categoria();
        this.catergorias.add(new CategoriaView(this));
    }
    
    
    public void nova_categoria(){
        this.catergorias.add(new CategoriaView(this));
    }
    
    public String categoria_getDesc_cat(){
        return(this.categoria.getDes_cat());
    }
    
    public void categoria_setDesc_cat(String des_cat){
        this.categoria.setDes_cat(des_cat);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.controller.CategoriaController;

public class CategoriaView {
    static int count = 0;
    public CategoriaController categoriaC;

    public CategoriaView(CategoriaController categoriaC) {
        count += 1;
        this.categoriaC = categoriaC;
    }
    
    public void categoria_getCategoria_soc(){
        System.out.println("A categoria do socio é: " + this.categoriaC.categoria_getDesc_cat());
    }
    
    
}

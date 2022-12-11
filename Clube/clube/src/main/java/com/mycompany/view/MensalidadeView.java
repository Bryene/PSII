/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.controller.MensalidadeController;

public class MensalidadeView {
    static int count = 0;
    public MensalidadeController mensalidadeC;

    public MensalidadeView(MensalidadeController mensalidadeC) {
        count +=1;
        this.mensalidadeC = mensalidadeC;
    }
    
    

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Mensalidade;
import com.mycompany.view.MensalidadeView;
import java.util.ArrayList;
import java.util.Date;

public class MensalidadeController {
    public ArrayList<MensalidadeView> mensalidades = new ArrayList<>();
    public Mensalidade mensalidade;
        
    public void nova_mensalidade(){
        this.mensalidades.add(new MensalidadeView(this));
    }
    
    public Date mensalidade_getData_mens(){
        return(this.mensalidade.getData_mens());
    }
    
    public void mensalidade_setData_mens(Date data_mens){
        this.mensalidade.setData_mens(data_mens);
    }
    
    public double mensalidade_getValor_mens(){
        return(this.mensalidade.getValor_mens());
    }
    
    public void mensalidade_setValor_mens(double valor_mens){
        this.mensalidade.setValor_mens(valor_mens);
    }
    
    public Date mensalidade_getData_pgto_mens(){
        return(this.mensalidade.getData_pgto_mens());
    }
    
    public void mensalidade_setData_pgto_mes(Date data_pgto_mens){
        this.mensalidade.setData_pgto_mens(data_pgto_mens);
    }
    
    public double mensalidade_getJuros_mens(){
        return(this.mensalidade.getJuros_mens());
    }
    
    public void mensalidade_setJuros_mens(double juros_mens){
        this.mensalidade.setJuros_mens(juros_mens);
    }
    
    public double mensalidade_getValor_pago(){
        return(this.mensalidade.getValor_pago());
    }
    
    public void mensalidade_setValor_pago(double valor_pago){
        this.mensalidade.setValor_pago(valor_pago);
    }
    
    public boolean mensalidade_isQuit_mens(){
        return(this.mensalidade.isQuit_mensa());
    }
    
    public void mensalidade_setQuit_mensa (boolean quit_mensa){
        this.mensalidade.setQuit_mensa(quit_mensa);
    }
    
}

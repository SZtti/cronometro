/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;

/**
 *
 * @author 20221stads003
 */
public class ControlladorMouse {
    private CronometroModel model;
    
    public void addModel(CronometroModel m){
        model = m;
    }
    
    public void receberComando(String comando){
        if(comando.equalsIgnoreCase("iniciar")){
            //chama metodo iniciar modelo
            model.iniciar();
        }
        else{
            //chama metodo parar modelo
            model.parar();
        }
    }
}

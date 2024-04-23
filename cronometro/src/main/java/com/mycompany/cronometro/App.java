/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;


/**
 *
 * @author 20221stads003
 */
public class App {
    
    private static boolean continua;
            
    public static void main(String[] args){
        CronometroView view = new CronometroView();
        CronometroModel model = new CronometroModel();;;
        ControlladorMouse controladorMouse = new ControlladorMouse();
        
        view.addControladorMouse(controladorMouse);
        model.addView(view);
       
        
    }
}

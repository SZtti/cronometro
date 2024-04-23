/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cronometro;

/**
 *
 * @author 20221stads003
 */
public interface Observador {
    public void observar(CoisaObservada coisa);
    
    public void receberAviso(long dado);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro;

import java.util.ArrayList;

/**
 *
 * @author 20221stads003
 */
public class CronometroModel implements CoisaObservada, Runnable{
    private long tempoInicial;//dado de interesse
    private ArrayList<Observador> views;//reg. views instanciadas
    private long dado;// dado de interesse das views
    private boolean continuar; //tempo para servir de parada do loop
    
    public CronometroModel(){
        views = new ArrayList<Observador>();
    }
    
    public void iniciar(){
        //setar variavel continuar como verdadeira e regitra o inicio do cronometro alem de iniciar ele
        tempoInicial = System.currentTimeMillis();
        continuar = true;
        new Thread(this).start();
    }
    
    public void parar(){
        //seta o continuar como falso
        continuar = false;
    }
    
    public void limpar(){
        
    }
    
    private void relogio(){
        //encapsulando loop
        while(continuar){
            long agora = System.currentTimeMillis();
            dado = agora - tempoInicial;
            for(Observador o: views){
                avisar(o);
            }
      
        }
    }
    
    @Override
    public void registrarObservador(Observador observador){
        //fun. recebe instancia do tipo observador. se a instancia ja foi registrada vida que segue.
        if(views.contains(observador)) return;
        views.add(observador);
    }
    
    @Override
    public void avisar(Observador observador){
        observador.receberAviso(dado);
    }
    
    public void addView(CronometroView v){
        registrarObservador(v);
        v.addModel(this);
    }
    
    @Override
    public void run(){
        relogio();
    }

}

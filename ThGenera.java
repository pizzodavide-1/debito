/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2debitopizzo;

import java.util.Random;

/**
 *
 * @author pizzo_davide
 */
public class ThGenera extends Thread{
     DatiCondivisi ptrDati;
    int num;
    int buffer;
    
    public ThGenera(DatiCondivisi dati){
    ptrDati=dati;
    this.num = ptrDati.getN();
        this.buffer=ptrDati.getBuffer();
    }
    public void run(){
     Random rand = new Random();
     for(int i=0;i<num;i++){
     ptrDati.WaitS4();
     buffer=rand.nextInt(37);
     if((buffer>0)&&(buffer<19)){
     ptrDati.inc118();
     }else if((buffer>18)&&(buffer<37)){
     ptrDati.inc1936();
     }
     ptrDati.setBuffer(buffer);
         ptrDati.SignalS1();
     }
    }
}

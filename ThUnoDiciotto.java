/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2debitopizzo;

/**
 *
 * @author pizzo_davide
 */
public class ThUnoDiciotto extends Thread{
    DatiCondivisi ptrDati;
    int num;
    int buffer;
    public ThUnoDiciotto(DatiCondivisi dati){
    ptrDati=dati;
         this.num = ptrDati.getN();
        this.buffer=ptrDati.getBuffer();
    }
    
    public void run(){
    for(int i=0;i<num;i++){
      ptrDati.WaitS1();
      buffer=ptrDati.getBuffer();
      if((buffer>0)&&(buffer<19)){
      ptrDati.inc118let();
      }
      ptrDati.SignalS2();
    }
    }
}

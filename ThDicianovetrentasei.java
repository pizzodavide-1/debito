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
public class ThDicianovetrentasei extends Thread{
    DatiCondivisi ptrDati;
    int num;
    int buffer;
    
    public ThDicianovetrentasei(DatiCondivisi dati){
    ptrDati=dati;
         this.num = ptrDati.getN();
        this.buffer=ptrDati.getBuffer();
    }
    public void run(){
    for(int i=0;i<num;i++){
    ptrDati.WaitS2();
    buffer=ptrDati.getBuffer();
    if((buffer>18)&&(buffer<37)){
        ptrDati.inc1936let();
    }
    ptrDati.SignalS3();
    }
    }
}

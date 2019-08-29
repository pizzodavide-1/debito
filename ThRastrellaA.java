/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1debitopizzo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pizzo_davide
 */
public class ThRastrellaA extends Thread {
    DatiCondivisi ptrDati;
    
    public ThRastrellaA(DatiCondivisi ptrDati){
    this.ptrDati=ptrDati;
    }
    
    public void run(){
        try {
            ptrDati.WaitS1();
            System.out.println("INIZIO PULIZIA PRATO A");
            Random rand = new Random();
            int x=rand.nextInt(6)+9;
            Thread.sleep(x*1000);
            System.out.println("FINE PULIZIA PRATO A");
            ptrDati.SignalS2();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRastrellaA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

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
public class ThTaglioA extends Thread{
    DatiCondivisi ptrDati;
    
    public ThTaglioA(DatiCondivisi ptrDati){
    this.ptrDati=ptrDati;
    }
    
    public void run(){
        try {
            ptrDati.WaitS2();
            System.out.println("INIZIO TAGLIO PRATO A");
            Random rand = new Random();
            int x=rand.nextInt(3)+3;
            Thread.sleep(x*1000);
            System.out.println("FINE TAGLIO PRATO A");
            ptrDati.SignalS1();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThTaglioA.class.getName()).log(Level.SEVERE, null, ex);
        }

}     

}



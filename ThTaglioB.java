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
public class ThTaglioB extends Thread{
    DatiCondivisi ptrDati;
    
    public ThTaglioB(DatiCondivisi ptrDati){
    this.ptrDati=ptrDati;
    }
    
    public void run(){
        try {
            ptrDati.WaitS4();
            System.out.println("INIZIO TAGLIO PRATO B");
            Random rand = new Random();
            int x=rand.nextInt(3)+3;
            Thread.sleep(x*1000);
            System.out.println("FINE TAGLIO PRATO B");
            ptrDati.SignalS3();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThTaglioB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

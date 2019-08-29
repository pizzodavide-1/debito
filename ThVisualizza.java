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
public class ThVisualizza extends Thread {
    DatiCondivisi ptrDati;
           int num;
    int buffer;
    int UnoDiciottoIns;
    int DicianoveTrentaseiIns;
    int UnoDiciottoLet;
    int DicianoveTrentaseiLet;
        public ThVisualizza(DatiCondivisi dati){
        ptrDati=dati;
        this.num = ptrDati.getN();
        this.buffer = ptrDati.getBuffer();
        }
        
        public void run(){
        for(int i=0;i<num;i++){
         ptrDati.WaitS3();
        buffer=ptrDati.getBuffer();
        UnoDiciottoIns=ptrDati.getUnoDiciottoIns();
        DicianoveTrentaseiIns=ptrDati.getDicianoveTIns();
        UnoDiciottoLet=ptrDati.getUnoDiciottoLet();
        DicianoveTrentaseiLet=ptrDati.getDicianoveTLet();
        
         System.out.println("Numero inserito-->"+ptrDati.getBuffer());
        System.out.println("Numeri da 1 a 18 inseriti-->"+UnoDiciottoIns);
        System.out.println("Numeri da 1 a 18 letti-->"+UnoDiciottoLet);
        System.out.println("Numeri da 19 a 36 inseriti-->"+DicianoveTrentaseiIns);
        System.out.println("Numeri da 19 a 36 letti-->"+DicianoveTrentaseiLet);
                ptrDati.SignalS4();
        }
        }
}

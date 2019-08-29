/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2debitopizzo;

import java.util.Scanner;

/**
 *
 * @author pizzo_davide
 */
public class Es2DEBITOPIZZO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
           Scanner input=new Scanner(System.in);
         java.io.BufferedReader console=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
          System.out.println("Quanti numeri vuoi generare?(massimo 100)");
         int n;
         n=input.nextInt();
         int zeroLet;
         
       if(n<101){
       DatiCondivisi dati=new DatiCondivisi(n);
         ThGenera thg=new ThGenera(dati);
         ThUnoDiciotto thud =new ThUnoDiciotto(dati);
          ThDicianovetrentasei thdc =new ThDicianovetrentasei(dati);
           ThVisualizza thv =new ThVisualizza(dati);
         
           thg.start();
           thud.start();
           thdc.start();
           thv.start();
           
           thg.join();
           thud.join();
           thdc.join();
           thv.join();
         
           zeroLet=n-(dati.getDicianoveTIns()+dati.getUnoDiciottoIns());
            System.out.println("ZeroInseriti--->"+zeroLet);
           
       }else{
       
       System.out.println("Massimo 100 numeri");
               }
         
         
             
         
    }
    
}

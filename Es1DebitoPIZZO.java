/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1debitopizzo;

import java.util.Scanner;

/**
 *
 * @author pizzo_davide
 */
public class Es1DebitoPIZZO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
           java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
           
            System.out.println("Digita '1' per partire");
           int scelta=input.nextInt();
           
           
          
           if(scelta==1){
            DatiCondivisi dati=new DatiCondivisi();
           ThTaglioA thta =new ThTaglioA(dati);
            ThTaglioB thtb =new ThTaglioB(dati);
             ThRastrellaA thra =new ThRastrellaA(dati);
              ThRastrellaB thrb =new ThRastrellaB(dati);
              
              thta.start();
              thtb.start();
              thra.start();
              thrb.start();
              
              thta.join();
              thtb.join();
              thra.join();
              thrb.join();
              
              System.out.println("FINE SIMULAZIONE");
           }else{
           System.out.println("FINE");
           }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2debitopizzo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pizzo_davide
 */
public class DatiCondivisi {
    private int n;
      private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    private int UnoDiciottoIns;
    private int UnoDiciottoLet;
    private int DicianoveTIns;
    private int DicianoveTLet;
    private int ZeroLet;
    private int buffer;
    public DatiCondivisi(int n){
      this.sem1=new Semaphore(0);
         this.sem2=new Semaphore(0);
            this.sem3=new Semaphore(0);
               this.sem4=new Semaphore(1);
               this.n=n;
      }
    public void inc118let(){
    UnoDiciottoLet++;
    }
    public void inc1936let(){
    DicianoveTLet++;
    }
public void inc118(){
UnoDiciottoIns++;
}
public void inc1936(){
DicianoveTIns++;
}
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Semaphore getSem1() {
        return sem1;
    }

    public void setSem1(Semaphore sem1) {
        this.sem1 = sem1;
    }

    public Semaphore getSem2() {
        return sem2;
    }

    public void setSem2(Semaphore sem2) {
        this.sem2 = sem2;
    }

    public Semaphore getSem3() {
        return sem3;
    }

    public void setSem3(Semaphore sem3) {
        this.sem3 = sem3;
    }

    public Semaphore getSem4() {
        return sem4;
    }

    public void setSem4(Semaphore sem4) {
        this.sem4 = sem4;
    }

    public int getUnoDiciottoIns() {
        return UnoDiciottoIns;
    }

    public void setUnoDiciottoIns(int UnoDiciottoIns) {
        this.UnoDiciottoIns = UnoDiciottoIns;
    }

    public int getUnoDiciottoLet() {
        return UnoDiciottoLet;
    }

    public void setUnoDiciottoLet(int UnoDiciottoLet) {
        this.UnoDiciottoLet = UnoDiciottoLet;
    }

    public int getDicianoveTIns() {
        return DicianoveTIns;
    }

    public void setDicianoveTIns(int DicianoveTIns) {
        this.DicianoveTIns = DicianoveTIns;
    }

    public int getDicianoveTLet() {
        return DicianoveTLet;
    }

    public void setDicianoveTLet(int DicianoveTLet) {
        this.DicianoveTLet = DicianoveTLet;
    }

    public int getZeroLet() {
        return ZeroLet;
    }

    public void setZeroLet(int ZeroLet) {
        this.ZeroLet = ZeroLet;
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }
    public void SignalS1(){
    sem1.release();
    }
    public void SignalS2(){
    sem2.release();
    }
    public void SignalS3(){
    sem3.release();
    }
    public void SignalS4(){
    sem4.release();
    }
    public void WaitS1(){
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void WaitS2(){
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void WaitS3(){
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void WaitS4(){
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

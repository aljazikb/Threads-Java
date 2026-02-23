package lab_4_cpit425;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aljaz
 */
public class ThreadOne extends Thread{
    @Override
    public void run(){
       
        for(int i=10;i>0 ;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread ONE is done");
    }
    
}

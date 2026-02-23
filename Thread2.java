/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4_cpit425;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aljaz
 */
public class Thread2 extends Thread{
    
    
    @Override
    public void run(){
        
        for(int i=1;i<=10 ;i++){
            System.out.println(i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Thread Two is done");
    }
        
    }
    


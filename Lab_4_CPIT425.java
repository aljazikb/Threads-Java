/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4_cpit425;

/**
 *
 * @author aljaz
 */
public class Lab_4_CPIT425 {

   
    public static void main(String[] args) throws InterruptedException {
        
        ThreadOne one=new ThreadOne();
        Thread2 two=new Thread2();
        //System.out.println(one.isAlive());
        
        //System.out.println(one.getName());
        //one.setName("First thread");
         //System.out.println(one.getName());
         //System.out.println(one.getPriority());
         //System.out.println(one.activeCount());
        
        
         one.start(); 
         System.out.println("Is thread One alive?"+one.isAlive());
         one.join();
         
         System.out.println("Is thread One alive?"+one.isAlive());
         
         System.out.println("-----------------------------------");
         
         
         two.start();
         System.out.println("Is thread Two alive?"+two.isAlive());
         two.join();
         System.out.println("Is thread Two alive?"+two.isAlive());

        
        
    }
    
}

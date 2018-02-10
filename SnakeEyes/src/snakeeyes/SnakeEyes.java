/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyes;

import textioc.TextIO;

/**
 *
 * @author micsa
 */
public class SnakeEyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
     
        
       /*
        SnakeEyes
        
        To develop the snakeEyes we have two dies to roll
        if the dies are the same the program print and finish
        
        Pseudocode:
        
        Declare two variable of dies
        Declare the counter of the loop
        
            Write a statement to loop simulating the roll of the dies
                Print the output of combination
        
        If the result of both is one display the output
        
        For loop running the program = 1000 times
            Calculate the average number of rolls required to get snake eyes.
        
        */
       
       int a;
        int b;
        
        int cSnakeEyes;
        boolean s;
        int times;
        int count;
        int rolledIn;
        int rolling;
        
        
        a = 0;
        b = 0;
        s = false;
        count = 0;
        cSnakeEyes = 0;
        rolledIn = 0;
        rolling = 0;
        
        for (times = 0; times < 1000; times++) {
            a = (int)(Math.random()*6)+1;
            b = (int)(Math.random()*6)+1;
            count++;
            System.out.println(count + " " + a + " and " + b);
            if (a == 1 && b == 1) {
                
                do {
                    s = true;
                    System.out.println(a + " and " + b);
                    if (a == b)
                        cSnakeEyes = cSnakeEyes + 1;
                        // System.out.println(cSnakeEyes);
                        if (cSnakeEyes <= 1) {
                            rolling = count;
                            // System.out.println(rolledIn + " First Snake Eye");
                            
                            
                        }
      
                } while (!s);
            
            rolledIn = count;
            
            }
            
            
        }
        
        
        System.out.println(rolling + " First Snake Eye");
        System.out.println("Counted SnakeEyes = " + cSnakeEyes);
        System.out.println(rolledIn + " Rolled");
        System.out.println("Averages = " + rolledIn/cSnakeEyes);
        
        
    }
    
}

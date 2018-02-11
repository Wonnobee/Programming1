/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyescount;

/**
 *
 * @author micsa
 */
public class SnakeEyesCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
     
        
       /*
        SnakeEyesCount
        
        To develop the snakeEyes we have two dies to roll
        if the dies are the same the program print and finish
        
        Pseudocode:
        
        Declare two variable of dices
        Declare the counter of the loop
        
        Write a loop statement that rolls 1000 times
            The dies has to give random numbers 1 to 6
            Print the output of combination
            While the loop is running get Snake Eyes
                If the die1 and die2 equals 1
                    Set true SnakeEyes
                
        Count how many rolls of dices needed to get Snake Eyes
        Sum how many times that Snake Eyes appear in 1000 times rolled.
            Calculate the average number of rolls
                Rolled happen to get Snake Eyes divided count of totat Snake Eyes appeared.
        
        */
       
        // Declaration variables
        int die1;
        int die2;
        
        int snakeEyesCount;
        boolean snakeEye;
        int countRolls;
        int counter;
        int firstSnakeEye;
        
        // Initialization variables
        die1 = 0;
        die2 = 0;
        
        snakeEyesCount = 0;
        snakeEye = false;
        countRolls = 0;
        counter = 0;
        firstSnakeEye = 0;
        
        // start the program
        // Now implement the loop to roll 1000 times
        
        for (int times =1; times <1001; times++) {
            // the values needed to the variables die1 and die2
            // the die output should be 1, 2, 3, 4, 5 and 6
            // use the (Math.random()*6)+1  if not adding 1 the output will be 0 to 5.
            die1 = (int)(Math.random()*6)+1;
            die2 = (int)(Math.random()*6)+1;
            
            // set a counter to know how many counts of rolls
            counter = counter + 1;
            
            // output the given result of the dies
            TextIO.putln("Program execute: " + counter + " || Rolled Dice1 is: " + die1 + " Dice2 is: " + die2);
                
            // if there is a Snake Eyes result of die1 == 1 and die2 == 1
                if (die1 == 1 && die2 == 1) {
                    // get snake eyes till the end of the program.
                    do {
                        snakeEye = true; // this tell to the loop that is true
                        snakeEyesCount = snakeEyesCount + 1; // this count the snake eyes
                         
                        // get the first snake eye
                        if (snakeEyesCount == 1) {
                            // store how many rolls before the first Snake Eye appear
                            firstSnakeEye = counter -1;
                            
                        }
 
                        
                    } while(!snakeEye); // waiting the variable to be true to terminate the loop
                    
                    // store how many dice rolls in a variable
                    // and the last snake eyes appear.
                    countRolls = counter;
                    
                }
                
                // do this loop if is true
                
                
        }
        TextIO.putln('\n');
        TextIO.putln("Dices rolled before to get snake eyes: " + firstSnakeEye);
        TextIO.putln("Snake Eyes total: " + snakeEyesCount + " in 1000 times");
        TextIO.putln("Dices rolled " + countRolls + " needed to get " + snakeEyesCount + " Snake Eyes");
        TextIO.putln("The averages of number of rolls is: " + countRolls/snakeEyesCount);
        TextIO.putln('\n');


        
    }
    
}

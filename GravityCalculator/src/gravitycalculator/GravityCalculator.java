/*
 * Victor Michael       2018
 * Unit1 Programming Assignment 
 * Gravity Calculator
 */
package gravitycalculator;

/**
 *
 * @author micsa
 */
import java.io.*;

public class GravityCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  gravity = -9.81; // Earth's gravity in m/s^2

        double  initialVelocity = 0.0; // starting velocity of the object

	double  fallingTime = 10.0; // time in seconds that the object falls

	double  initialPosition = 0; // Starting position in meters, the calculation will 		determine the ending position in meters

	double  finalPosition;
        
        // Function Notation: x(t) = 0.5 × at^2 + vit + xi 
                
        // Converting the function notation into 
        // x(fallingtime) = 0.5 x gravity x (fallingTime*fallingTime) + initialVelocity x fallingTime + initialPosition
        finalPosition = 0.5*gravity*(fallingTime*fallingTime)+initialVelocity*fallingTime+initialPosition;
        
        
                

	System.out.println("The object's position after " + fallingTime +" seconds is 			"+finalPosition + " m.");

    }
    
}

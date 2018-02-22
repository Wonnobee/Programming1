/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package icecreamscount;

/**
 *
 * @author Victor Michael Saltat
 * @university University of the People
 * @project IceCreamsCount
 * @date Feb 16, 2018 @time 10:32:50 PM
 *
 */
public class IceCreamsCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Ready to develop your program!");
        
        
        int countStrawberry;
        int countCones;
        double percentage;
        String flavor;
        
        countStrawberry = 0;
        countCones = 1; // initialize to 1
       
            try {
            // read the file with TextIO
            TextIO.readFile("H:\\UoPeople\\Term3-Feb1-April4\\CS1102-Programming1-Java\\Unit1-1Feb-7Feb\\Projects\\IceCreamsCount\\src\\icecreamscount\\icecream.dat");
            System.out.println("The file is ready");
            System.out.println();
            System.out.println("List of ice cream flavors: ");
            //flavor = TextIO.getln();
            //TextIO.putln(flavor);
                // read all the lines of the file
                while (TextIO.eof() == false) {
                
                flavor = TextIO.getln();
                TextIO.putln(flavor);
                
                    if (flavor.equals("Strawberry")) {
                     
                    countStrawberry++; // Count how many Strawberry flavors sold
                    }
                
                countCones++;

                }
            }
            catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Try again.");
            }
            

            System.out.println();
            System.out.println(countCones + " total cones.");
            System.out.println(countStrawberry + " Strawberry cones.");
            percentage = countStrawberry*100/ countCones;
            System.out.println("The percentage of Strawberry cones is: " + percentage + "%"); // Print the porcentages
            System.out.println("");
        


    }

}

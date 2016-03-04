
package com.leapfrog.mathcommand;


import com.leapfrog.mathcommand.util.command.MathCommand;
import com.leapfrog.mathcommand.util.command.MathFactory;
import java.util.Scanner;

/**
 *
 * @author Devendra
 */
public class Program {

    public static void main(String[] args) {
   
        int total = 0;
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Enter first number :: ");
            int x = scan.nextInt();
            
            System.out.println("Enter second number :: ");
            int y = scan.nextInt();
            
            System.out.println("===================");
            System.out.println("Enter your choice::");
            System.out.println("===================");
            System.out.println("1. Add. ");
            System.out.println("2. Subtract. ");
            System.out.println("3. Multiply. ");
            System.out.println("4. Divide. ");
            
            String choice = scan.nextLine();
            
            MathCommand cmd = new MathFactory().get(choice);
            
            if (cmd!=null){
                System.out.println("The total :: " + cmd.calculate(x, y));
            }
            
            else{
                System.out.println("Invalid Command !!!");
            }
            
            System.out.println("Do you want to try again (y/n)");
            if(scan.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
            
            
        }
    }
    
}

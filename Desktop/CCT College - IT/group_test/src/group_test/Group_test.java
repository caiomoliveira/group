/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_test;

import java.util.Scanner;

/**
 *
 * @author Grupo Rugby
 * @william
 * @wallace
 * @mayara
 * @renner
 * @caio
 */
public class Group_test {

    // Mayara
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;

    }

    public double divide(double a, double b) {

        if (b == 0) {

            System.out.println("Error! Dividing by zero is not allowed.");

            return 0;

        } else {

            return a / b;

        }
    }

    public double modulo(double a, double b){
            
            if( b == 0) {
              
              System.out.println("Error! Dividing by zero is not allowed.");
              
              return 0;
              
            } else {
              
              return a % b;
            }

    public static void main(String[]args) { 
    
        try{
        
        Scanner input = new Scanner(System.in);
        
        double a;
        double b;
        int operation;
        
            System.out.println("Type first number: ");
            a = input.nextDouble();
            System.out.println("Type second number: ");
            b = input.nextDouble();
            System.out.println("Type a number for an operation: " + "\n" + "Sum = 1" + "\n" + "Sub = 2" + "\n" + "Div = 3" + "\n" + "Mul = 4" + "\n" + "Mod = 5" + "\n" + "Exit = 6");
            operation = input.nextInt();
        }
            Calculator myCalculator = new Calculator();
            
            switch (operation) {
                case 1:
                    System.out.println("Suming result: " +(myCalculator.add(a,b)));
                    break;
                case 2:
                    System.out.println("Subtracting result: "+(myCalculator.subtract(a,b)));
                    break;
                case 3:
                    System.out.println("Dividing result: "+(myCalculator.divide(a,b)));
                    break;
                    case 4:
                    System.out.println("Multiplying result: "+(myCalculator.multiply(a,b)));
                    break;
                case 5:
                    System.out.println("Moduling result: "+(myCalculator.modulo(a,b)));
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            
    
        }catch(

    Exception e)
    {
        System.out.println("Numbers only!");
    }
}
}

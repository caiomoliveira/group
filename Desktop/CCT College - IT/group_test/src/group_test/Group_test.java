/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_test;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 *
 * @author 35383
 */
public class Group_test {

    }

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

    static void WillianMethood() {
        //Willian
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

        static void wallace() {
        /**
         * @Wallace
         */
        System.out.println("wallace here");
        return;
    }

    static void CaioOliveira() {
        /**
         * @Caio
         */
        System.out.println("Caio here");
        return;
    }

    public static void main(String[] args) {

        Mayaramethod();
        WillianMethood();
        wallace();
        CaioOliveira();
        rennerSantana();

    }
}
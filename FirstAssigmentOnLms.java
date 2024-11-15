/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstassigmentonlms;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class FirstAssigmentOnLms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         FactorialCalculator calculator = new RecursiveFactorialCalculator(5);
        System.out.println("Factorial of 5: " + calculator.calculateFactorial());
    }
    
}

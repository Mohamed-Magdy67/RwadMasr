/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Mohamed
 */
public class PrimeChecker extends Number {
    public PrimeChecker(int num) {
        super(num);
    }

    public boolean isPrime() {
        int n = getNum();
        
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true;
    }
}

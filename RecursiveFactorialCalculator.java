/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstassigmentonlms;

/**
 *
 * @author Mohamed
 */
class RecursiveFactorialCalculator extends FactorialCalculator {

    public RecursiveFactorialCalculator(int number) {
        super(number);
    }

    @Override
    public long calculateFactorial() {
        return factorial(getNumber());
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

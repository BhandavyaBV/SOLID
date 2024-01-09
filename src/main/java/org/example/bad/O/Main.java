package org.example.bad.O;

public class Main {
    public static void main(String[] args){
        Calculate calculations = new Calculate();
        calculations.arithmeticCalculations("linear",5,2,0);
        calculations.arithmeticCalculations("quadratic",6,9,3);
        calculations.arithmeticCalculations("factorial",5,0,0);
        calculations.arithmeticCalculations("pythogorean",4,3,0);
        calculations.arithmeticCalculations("fibonaccii",10,0,0);
        calculations.arithmeticCalculations("distance-calculator",3,4,8);
        calculations.arithmeticCalculations("gp",2,6,18);
        calculations.arithmeticCalculations("ap",2,4,6);

    }
}

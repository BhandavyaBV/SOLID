package org.example.good.O;

public class QuadracticEquation implements ICalculate{

    private double coefficientA;
    private double coefficientB;
    private double coefficientC;


    public QuadracticEquation(double coefficientA, double coefficientB, double coefficientC) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
    }

    @Override
    public void calculate() {
        System.out.println("---------------------------------------------");
        System.out.println("Quadratic equation - 6x2 + 9x + 3 = 0");
        if(coefficientA==0){
            System.out.println("Coefficient A cannot be 0");
        }
        else{
            double dividend = Math.pow(coefficientB,2)-(double)(4*coefficientA*coefficientC);
            if(dividend>0){
                System.out.println("There exists 2 real roots");
                double res1 = (-coefficientB+Math.sqrt(dividend))/(2*coefficientA);
                double res2 =  (-coefficientB-Math.sqrt(dividend) )/(2*coefficientA);
                System.out.println("Root1 is : "+res1);
                System.out.println("Root2 is : "+res2);
            }
            else if(dividend==0){
                double root = -coefficientB/(2*coefficientA);
                System.out.println("For the given coefficients, there exists 1 real root : "+root);
            }
            else {
                System.out.println("There are no real roots for the given co-efficients");
            }
        }
    }
}

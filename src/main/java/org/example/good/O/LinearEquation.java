package org.example.good.O;

public class LinearEquation implements ICalculate{

    private double coefficientA;
    private double coefficientB;

    public LinearEquation(double coefficientA, double coefficientB) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
    }

    @Override
    public void calculate(){
        System.out.println("--------------------------------");
        System.out.println("Linear equation");
        if(coefficientA==0){
            System.out.println("Coefficient A cannot be 0");
        }
        else{
            System.out.println("Result of linear equation 5x+2=0 is: ");
            System.out.println(-coefficientB/coefficientA);
        }
    }
}

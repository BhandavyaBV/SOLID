package org.example.good.O;

public class ArithmeticSeries implements ICalculate{

    private int n;
    private int a1;
    private int a2;
    private int a3;

    public ArithmeticSeries(int n, int a1, int a2, int a3) {
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public void calculate() {
        if(n<=1){
            System.out.println("Arithmetic sum cannot be calculated for 1 or lessor elements");
        }
        else if(a2-a1 != a3-a2){
            System.out.println("Given series is not an Arithmetic series");
        }
        else{
            double d = a2-a1;
            System.out.println("------------------------------------");
            double tempValue = (2*a1)+(n-1)*d;
            double sum = (n*tempValue)/2;
            System.out.println("Sum of arithmetic series 2,4,6 is: "+sum);
        }
    }
}

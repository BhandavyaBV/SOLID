package org.example.good.O;

public class Factorial implements ICalculate{
    public Factorial(int n) {
        this.n = n;
    }

    private int n;
    @Override
    public void calculate() {
        System.out.println("-------------------------------");
        System.out.println("Factorial");
        if(n<=0){
            System.out.println("Factorial is only possible for whole numbers (1 and above)");
        }
        else{
            int res = calculateFactorial(n);
            System.out.println("Factorial of "+n+" is : "+res);
        }
    }

    public static int calculateFactorial(double n){
        if(n==1){
            return 1;
        }
        else{
            return (int) n*calculateFactorial(n-1);
        }
    }
}

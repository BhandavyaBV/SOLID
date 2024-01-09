package org.example.good.O;

public class Fibonacci implements ICalculate{

    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public void calculate() {
        System.out.println("---------------------------------");
        System.out.println("Fibonacci series");
        if(n<=2){
            System.out.println(" Cannot generate fibonacci series of 2 numbers ");
        }
        else{
            System.out.println(" Printing Fibonacci series upto "+n);
            int currValue = 1;
            int previousValue=0;
            System.out.print(previousValue+" , ");
            for(int i=1;i<=n-2;i++){
                System.out.print(currValue+" , ");
                int temp = previousValue;
                previousValue = currValue;
                currValue = currValue+temp;
            }
            System.out.println( );

        }

    }
}


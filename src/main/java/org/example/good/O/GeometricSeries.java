package org.example.good.O;

public class GeometricSeries implements ICalculate {
    private int n;
    private int a1;
    private int a2;
    private int a3;

    public GeometricSeries(int n, int a1, int a2, int a3) {
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public void calculate() {
        System.out.println("-----------------------------");

        if(n<=0){
            System.out.println("N cannot be 0");
        }
        else if(a2/a1 != a3/a2){
            System.out.println("Given series is not Geometric series");
        }
        else{
            double r = a2/a1;
            double numerator = a1 * (1-Math.pow(r,n));
            double sum = numerator/(1-r);
            System.out.println("Goemetric sum of the sequence 2,6,18 is : "+sum);

        }
    }
}

package org.example.good.O;

public class DistanceCalculator implements ICalculate{
    private long x1;
    private long y1;

    public DistanceCalculator(long x1, long y1, long x2, long y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private long x2;
    private long y2;

    @Override
    public void calculate() {

        System.out.println("-----------------------");
        System.out.println("Distance Calculator");
        double numerator = Math.pow((x2-x1),2);

        double denominator = Math.pow(y2-y1,2);
        double value = Math.sqrt(numerator+denominator);
        System.out.println("Distance between the points ("+x1+","+y1+") and ("+x2+","+y2+") is : "+value);
    }
}

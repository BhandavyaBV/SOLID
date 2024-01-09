package org.example.good.O;

public class Pythogorean implements ICalculate{
    private int side1;
    private int side2;
    public Pythogorean(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void calculate() {
        System.out.println("------------------------------");
        System.out.println("Pythogorean");
        System.out.println("Value of hypotenuse is : "+Math.sqrt((Math.pow(side1,2)+(Math.pow(side2,2)))));
    }
}

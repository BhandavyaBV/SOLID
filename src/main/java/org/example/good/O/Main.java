package org.example.good.O;

public class Main {
    public static void main(String[] args){

        ICalculate calculate;
//        Linear Equation
        calculate = new LinearEquation(5,2);
        calculate.calculate();

//        Quadractic equation
        calculate = new QuadracticEquation(6,9,3);
        calculate.calculate();

//        Factorial
        calculate = new Factorial(5);
        calculate.calculate();

//        Pythogorean
        calculate = new Pythogorean(4,3);
        calculate.calculate();

//        Fibonacci
        calculate = new Fibonacci(10);
        calculate.calculate();

//        Distance Calculator
        calculate = new DistanceCalculator(2,3,-1,-2);
        calculate.calculate();

//        Geometric Series
        calculate = new GeometricSeries(3,2,6,18);
        calculate.calculate();

        calculate = new ArithmeticSeries(3,2,4,6);
        calculate.calculate();
    }
}

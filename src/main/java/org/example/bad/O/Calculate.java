package org.example.bad.O;

public class Calculate {
    public void arithmeticCalculations(String type, double coefficientA , double coefficientB , double coefficientC){
        if(type=="linear"){
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
        else if(type=="quadratic"){
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
        else if(type=="factorial"){
            System.out.println("-------------------------------");
            System.out.println("Factorial");
            if(coefficientA<=0){
                System.out.println("Factorial is only possible for whole numbers (1 and above)");
            }
            else{
                int res = calculateFactorial(coefficientA);
                System.out.println("Factorial of "+coefficientA+" is : "+res);
            }
        }
        else if(type=="pythogorean"){
            System.out.println("------------------------------");
            System.out.println("Pythogorean");
            System.out.println("Value of hypotenuse is : "+Math.sqrt((Math.pow(coefficientA,2)+(Math.pow(coefficientB,2)))));

        }
        else if(type=="fibonaccii"){
            System.out.println("---------------------------------");
            System.out.println("Fibonacci series");
            if(coefficientA<=2){
                System.out.println(" Cannot generate fibonacci series of 2 numbers ");
            }
            else{
                System.out.println(" Printing Fibonacci series upto "+coefficientA);
                int currValue = 1;
                int previousValue=0;
                System.out.print(previousValue+" , ");
                for(int i=1;i<=coefficientA-2;i++){
                    System.out.print(currValue+" , ");
                    int temp = previousValue;
                    previousValue = currValue;
                    currValue = currValue+temp;
                }
                System.out.println( );

            }

        }
        else if(type=="distance-calculator"){
            System.out.println("-----------------------");
            System.out.println("Distance Calculator");
            double numerator = Math.pow((coefficientC-coefficientA),2);

            double denominator = Math.pow(coefficientA-coefficientB,2);
            double value = Math.sqrt(numerator+denominator);
            System.out.println("Distance between the points ("+coefficientA+","+coefficientB+") and ("+coefficientC+","+coefficientA+") is : "+value);

        }
        else if(type=="gp"){
            System.out.println("-----------------------------");

            double n = 3;
            double a1 = coefficientA;
            double a2 = coefficientB;
            double a3 = coefficientC;

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
                System.out.println("Goemetric sum of the sequence 2,6,18,54 is : "+sum);

            }
        }
        else if(type=="ap"){
            double n=3;
            double a1 = coefficientA;
            double a2 = coefficientB;
            double a3 = coefficientC;
            if(n<=1){
                System.out.println("Arithmetic sum cannot be calculated for 1 or lessor elements");
            }
            else if(a2-a1 != a3-a2){
                System.out.println("Given series is not an Arithmetic series");
            }
            else{
                double d = a2-a1;
                System.out.println("------------------------------------");
                double tempValue = 2*a1+(n-1)*d;
                double sum = (n/2)*tempValue;
                System.out.println("Sum of arithmetic series 2,4,6 is: "+sum);
            }

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

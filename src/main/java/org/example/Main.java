package org.example;

public class Main {
    public static void main(String[] args) {


        MathFunctions matFunctions = new MathFunctions(3.14, 2.718);

        System.out.println("Circle Area (r=6): " + MathFunctions.calculateAreaOfCircle(6));
        System.out.println("e^3: " + MathFunctions.calculateExponential(3));
        System.out.println("Triangle Area (a=3, b=4, c=5): " + MathFunctions.calculateHeronFormula(3, 4, 5));





    }
}
package org.example;

public class MathFunctions {
   static double pi;
   static double e;

   public MathFunctions( double piV, double eV){
       pi = piV;
       e = eV;
   }

   public static double calculateAreaOfCircle(double radius){
       return (pi*radius*radius);
   }

    public static double calculateExponential(double a) {
        double result = 1.0;
        for (int i = 0; i < a; i++) {
            result *= e;
        }
        return result;
    }

    public static double calculateHeronFormula(double a, double b, double c){
       double s = (a+b+c)/2;
       return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }





}

package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangleArea = (A * C) / 2;
        double circleArea = 3.14159 * Math.pow(C, 2);
        double trapezeArea = (A + B) * C / 2;
        double squareArea = Math.pow(B, 2);
        double retangleArea = A * B;


        System.out.printf("TRIANGLE = %.3f%n", triangleArea);
        System.out.printf("CIRCLE = %.3f%n", circleArea);
        System.out.printf("TRAPEZE = %.3f%n", trapezeArea);
        System.out.printf("SQUARE = %.3f%n", squareArea);
        System.out.printf("RETANGLE = %.3f%n", retangleArea);

        sc.close();
    }
}

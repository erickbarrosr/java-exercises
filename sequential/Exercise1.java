package sequential;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstValue = sc.nextInt();
        int secondValue = sc.nextInt();

        int response = firstValue + secondValue;

        System.out.println("SOMA = " + response);

        sc.close();
    }
}
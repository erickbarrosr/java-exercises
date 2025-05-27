package sequential;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstValue = sc.nextInt();
        int secondValue = sc.nextInt();
        int thirdValue = sc.nextInt();
        int fourthValue = sc.nextInt();

        int difference = (firstValue * secondValue) - (thirdValue * fourthValue);

        System.out.println("DIFERENÇA = " + difference);

        sc.close();
    }
}

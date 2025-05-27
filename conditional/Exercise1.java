package conditional;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}

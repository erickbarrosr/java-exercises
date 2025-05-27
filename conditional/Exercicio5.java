package conditional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE O CÓDIGO DO ITEM: ");
        int code = sc.nextInt();

        System.out.print("DIGITE A QUANTIDADE DO ITEM: ");
        int quantity = sc.nextInt();

        double total;

        switch (code) {
            case 1:
                total = 4 * quantity;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 2:
                total = 4.5 * quantity;
                System.out.println("Total: " + total);
                break;
            case 3:
                total = 5 * quantity;
                System.out.println("Total: " + total);
                break;
            case 4:
                total = 2 * quantity;
                System.out.println("Total: " + total);
                break;
            case 5:
                total = 1.5 * quantity;
                System.out.println("Total: " + total);
                break;
            default:
                System.out.println("DIGITE UM CÓDIGO VÁLIDO.");
        }

        sc.close();
    }
}

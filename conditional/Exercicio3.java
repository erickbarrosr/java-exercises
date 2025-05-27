package conditional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int firstNumber = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int secondNumber = sc.nextInt();

        if (firstNumber % secondNumber == 0) {
            System.out.println("São múltiplos");
        } else if (secondNumber % firstNumber == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}

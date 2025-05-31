package repetitive;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dbPassword = 2002;

        System.out.print("Digite a senha: ");
        int password = sc.nextInt();

        while (password != dbPassword) {
            System.out.print("Digite novamente a senha: ");
            password = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}

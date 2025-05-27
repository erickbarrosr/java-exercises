package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int partCodeOne = sc.nextInt();
        int partQtyOne = sc.nextInt();
        double partUnitValueOne = sc.nextDouble();
        double partTotalValueOne = partQtyOne * partUnitValueOne;

        int partCodeSecond = sc.nextInt();
        int partQtySecond = sc.nextInt();
        double partUnitValueSecond = sc.nextDouble();
        double partTotalValueSecond = partQtySecond * partUnitValueSecond;

        double valueToPay = partTotalValueOne + partTotalValueSecond;

        System.out.printf("VALOR À PAGAR: R$ %.2f%n", valueToPay);

        sc.close();
    }
}

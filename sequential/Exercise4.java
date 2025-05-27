package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double valuePerHour = sc.nextDouble();
        double salary = workedHours * valuePerHour;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}

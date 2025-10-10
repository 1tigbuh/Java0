package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сума доходу: ");
        double income = scanner.nextDouble();
        double tax;

        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = income * 0.043;
        } else {
            tax = income * 0.067;
        }

        System.out.printf("Сума податку: %.2f грн%n", tax);
        scanner.close();
    }
}
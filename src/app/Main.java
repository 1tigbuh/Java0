package app;

public class Main {
    public static void main(String[] args) {
        String product1 = "smartphone";
        int quantity1 = 64;
        double price1 = 350.00;
        int days1 = 5;
        double total1 = quantity1 * price1;
        double average1 = total1 / days1;

        String product2 = "laptop";
        int quantity2 = 16;
        double price2 = 260.00;
        int days2 = 7;
        double total2 = quantity2 * price2;
        double average2 = total2 / days2;

        System.out.printf("Product No 1: %s,%n", product1);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days1, total1);
        System.out.printf("sales by day is EUR %.2f.%n", average1);

        System.out.printf("Product No 2: %s,%n", product2);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days2, total2);
        System.out.printf("sales by day is EUR %.2f.%n", average2);
    }
}
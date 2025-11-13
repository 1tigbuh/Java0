// ДЗ 10.1, зараз методи в camelCase
package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = sc.nextInt();
        printSquare(num);

        System.out.print("Введіть радіус: ");
        double radius = sc.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = sc.nextDouble();
        double volume = cylVol(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);

        System.out.print("Введіть кількість елементів масиву: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Масив чисел: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Сума всіх елементів масиву дорівнює " + arrSum(arr));

        sc.nextLine();
        System.out.print("Введіть рядок: ");
        String txt = sc.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reversStr(txt));

        System.out.print("Введіть a: ");
        int a = sc.nextInt();
        System.out.print("Введіть b: ");
        int b = sc.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b));

        System.out.print("Введіть ціле число n: ");
        int times = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String line = sc.nextLine();
        printTxt(times, line);
    }
    public static void printSquare(int num) {
        System.out.println("Квадрат числа " + num + " дорівнює " + (num * num));
    }

    public static double cylVol(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static String reversStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    public static void printTxt(int n, String txt) {
        for (int i = 0; i < n; i++) System.out.println(txt);
    }
}
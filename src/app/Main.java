package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int numb = sc.nextInt();
        Square(numb);


        System.out.print("Введіть радіус: ");
        double R = sc.nextDouble();
        System.out.print("Введіть висоту: ");
        double h = sc.nextDouble();
        System.out.println("Об'єм циліндра з радіусом " + R + " і висотою " + h + " дорівнює " + Vol(R, h) + ".");


        System.out.print("Введіть кількість елементів масиву:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Масив чисел: " + Arrays.toString(arr));
        int sum = SumArr(arr);
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");


        sc.nextLine();
        System.out.print("Введіть рядок: ");
        String text = sc.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + ReverseStr(text));


        System.out.print("Введіть a: ");
        int a = sc.nextInt();
        System.out.print("Введіть b: ");
        int b = sc.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");


        System.out.print("Введіть ціле число n: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть текстовий рядок:");
        String t = sc.nextLine();
        RepeatTxt(n, t);
    }


    public static void Square(int n) {
        System.out.println("Квадрат числа " + n + " дорівнює " + (n * n) + ".");
    }

    public static double Vol(double R, double h) {
        return Math.PI * R * R * h;
    }

    public static int SumArr(int[] arr) {
        int sum = 0;
        for (int numb : arr) sum += numb;
        return sum;
    }

    public static String ReverseStr(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void RepeatTxt(int n, String text) {
        for (int i =0; i < n; i++) System.out.println(text);
    }
}
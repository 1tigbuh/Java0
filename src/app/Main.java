package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));
        InsertionSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));
        System.out.print("Введіть число для пошуку: ");

        int tar = scanner.nextInt();

        int index = Search(array, tar);
        if (index != -1) {
            System.out.println("Індекс числа " + tar + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Числа " + tar + " немає.");
        }

        scanner.close();
    }


    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > n) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = n;
        }
    }


    public static int Search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
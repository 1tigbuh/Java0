
package app;

public class Main {
    public static void main(String[] args) {
        int[] arr = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        System.out.print("Елементи масиву: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        int sumofNegatives = 0;
        for (int num : arr) {
            if (num < 0) sumofNegatives += num;
        }
        System.out.println("Сума від'ємних чисел: " + sumofNegatives);
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Кількість парних чисел: " + even);
        System.out.println("Кількість непарних чисел: " + odd);

        int min = arr[0], max = arr[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        int firstNegative = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                firstNegative = i;
                break;
            }
        }
        if (firstNegative == -1 || firstNegative == arr.length - 1) {
            System.out.println("Від'ємних чисел немає або після них немає елементів.");
        } else {
            int sum = 0;
            int count = 0;
            for (int i = firstNegative + 1; i < arr.length; i++) {
                sum += arr[i];
                count++;
            }
            double average = (double) sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f\n", average);
        }
    }
}
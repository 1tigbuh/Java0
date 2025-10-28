package app;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(50) + 1;
            }
        }
        for (int i = 0; i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        int evenrows = 0;
        int oddrows = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) evenrows += matrix[i][j];
                else oddrows += matrix[i][j];
            }
        }
        long evencols = 1;
        long oddcols = 1;
        for (int j = 0;j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (j % 2 == 0) evencols *= matrix[i][j];
                else oddcols *= matrix[i][j];
            }
        }

        System.out.println("Сума парних рядків: " + evenrows);
        System.out.println("Сума непарних рядків: " + oddrows);
        System.out.println("Добуток парних стовпців: " + evencols);
        System.out.println("Добуток непарних стовпців: " + oddcols);

        int magsum = 0;
        for (int j = 0; j < 4; j++) {
            magsum += matrix[0][j];
        }
        boolean magic = true;
        for (int i = 1; i < 4 && magic; i++) {
            int rowsum = 0;
            for (int j = 0; j < 4; j++) rowsum += matrix[i][j];
            if (rowsum != magsum) magic = false;
        }
        for (int j = 0; j < 4 && magic; j++) {
            int sumcol = 0;
            for (int i = 0; i < 4; i++) sumcol += matrix[i][j];
            if (sumcol != magsum) magic = false;
        }
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < 4; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][3 - i];
        }
        if (diag1 != magsum || diag2 != magsum) magic = false;

        if (magic)
            System.out.println("Матриця є магічним квадратом.");
        else
            System.out.println("Матриця не є магічним квадратом.");
    }
}
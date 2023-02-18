package ru.netology.osvovy.lvl2.hw8;

import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;
    public static final int MAX_VALUE = 255;
    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        String input = "";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = (int) ((Math.random() * MAX_VALUE) + 1);
            }
        }

        printMatrix(matrix);

        System.out.println("Выберите угол поворота - 90, 180 или 270: ");
        input = scanner.nextLine();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (input) {
                    case "90": {
                        rotatedColors[i][j] = matrix[SIZE - 1 - j][i];
                        break;
                    }
                    case "270": {
                        rotatedColors[i][j] = matrix[j][SIZE - 1 - i];
                        break;
                    }
                    case "180": {
                        rotatedColors[i][j] = matrix[SIZE - 1 - i][SIZE - 1 - j];
                        break;
                    }
                    default: {
                        System.out.println("Неверный угол поворота!");
                        return;
                    }
                }
            }
        }

        printMatrix(rotatedColors);

    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Матрица: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}

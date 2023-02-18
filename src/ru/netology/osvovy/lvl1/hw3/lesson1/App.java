package ru.netology.osvovy.lvl1.hw3.lesson1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(true) {
            System.out.println("Введите год в формате \"yyyy\":");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int userDaysInput = scanner.nextInt();

            int daysCount = 365; //defaul days in year

            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                daysCount = 366;
            }

            if(userDaysInput == daysCount){
                counter++;
            }
            else {
                System.out.println("Неправильно! В этом году " + daysCount + " дней!");
                System.out.println("Набрано очков: " + counter);
                break;
            }
        }
    }
}

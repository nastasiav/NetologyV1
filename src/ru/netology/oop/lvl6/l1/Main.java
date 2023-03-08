package ru.netology.oop.lvl6.l1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
         while (true) {
             printMenu();
             String line = scanner.nextLine();
             if(line.equals("0")){
                 break;
             }
             switch (line) {
                 case "1":
                     addCase(list, scanner);
                     break;
                 case "2":
                     printCases(list);
                     break;
                 case "3":
                     deleteCaseNumber(list, scanner);
                     break;
                 case "4":
                     deleteCaseValue(list, scanner);
                     break;
                 case "5":
                     deleteCasePartValue(list, scanner);
                     break;
             }
         }
    }

    private static void deleteCasePartValue(List<String> list, Scanner scanner) {
        System.out.print("Введите часть названия: ");
        String val = scanner.nextLine();
        List<String> removeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(val)) {
                removeList.add(list.get(i));
            }
        }
        list.removeAll(removeList);
    }

    private static void deleteCaseValue(List<String> list, Scanner scanner) {
        System.out.print("Введите название: ");
        String val = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(val)) {
               list.remove(i);
            }
        }
    }

    private static void deleteCaseNumber(List<String> list, Scanner scanner) {
        System.out.print("Введите номер: ");
        int n = Integer.parseInt(scanner.nextLine());
        list.remove(n - 1);
    }

    private static void printCases(List<String> list) {
        System.out.println("Ваш список дел: ");
        int numberOfCases = 1;
        for (String line : list) {
            System.out.println(numberOfCases + ". " + line);
            numberOfCases++;
        }
    }

    private static void addCase(List<String> list, Scanner sc) {
        System.out.print("Введите дело: ");
        list.add(sc.nextLine());
        System.out.println("Добавлено!");
    }

    public static void printMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.println("5. Удалить дело по части названия");
    }
}

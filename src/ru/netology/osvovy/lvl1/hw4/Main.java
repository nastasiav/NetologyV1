package ru.netology.osvovy.lvl1.hw4;

import java.util.Scanner;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = 0;
        int expense = 0;
        int incomeTax = 0;
        int expenseTax = 0;
        while(true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать сиcтему налогооблажения");

            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода:");
                        income += Integer.parseInt(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода:");
                        expense += Integer.parseInt(scanner.nextLine());
                        break;
                    case 3:
                        incomeTax = calculateIncomeTax(income);
                        expenseTax = calculateExpenseTax(income, expense);
                        if(incomeTax == expenseTax) {
                            System.out.println("Можете выбрать любую систему налогооблажения");
                        }
                        else{
                            int taxDiff = incomeTax - expenseTax;
                            System.out.println("Мы советуем вам " + (taxDiff < 0 ? "УСН доходы" : "УСН доходы минус расходы"));
                            System.out.println("Ваш налог составит: " + (taxDiff < 0 ? incomeTax : expenseTax)+ " рублей");
                            System.out.println("Налог на другой системе: " + (taxDiff < 0 ? expenseTax : incomeTax) + " рублей");
                            System.out.println("Экономия: " + Math.abs(taxDiff) + " рублей");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("Программа завершена!");
    }

    public static int calculateIncomeTax(int income) {
        int incomeTax = (int) (income * 0.06);
        return incomeTax;
    }
    public static int calculateExpenseTax(int income, int expense) {
        int expenseTax = (int) ((income - expense) < 0 ? 0 : (income - expense) * 0.15);
        return expenseTax;
    }
}

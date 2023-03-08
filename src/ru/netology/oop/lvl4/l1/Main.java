package ru.netology.oop.lvl4.l1;

import java.util.Scanner;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        int minLen;
        int maxRep;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите мин. длину пароля: ");
        minLen = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
        maxRep = Integer.parseInt(scanner.nextLine());

        PasswordChecker passwordChecker = new PasswordChecker();
        passwordChecker.setMaxRepeats(maxRep);
        passwordChecker.setMinLength(minLen);

        while (true) {
            System.out.print("Введите пароль или end: ");
            String key = scanner.nextLine();
            if(key.equals("end")) {
                break;
            }
            if (passwordChecker.verify(key)) {
                System.out.println("Подходит");
            }
            else {
                System.out.println("Не подходит");
            }
        }
    }

}

package ru.netology.osvovy.lvl2.hw7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Конфеты", "Хлеб", "Молоко"};
        int[] prices = {200, 55, 105};
        int[] purchaseProduct = new int[3];
        int[] purchaseCount = new int[3];


        printProducts(products, prices);
        while (true) {
            printOption();
            String line = scanner.nextLine();

            if (line.equals("end")) {
                if (purchaseProduct.length != 0) {
                    printPurchase(purchaseProduct, purchaseCount, products, prices);
                }
                break;
            }
            String[] order = line.split(" ");
            if(order.length == 2) {
                int product = Integer.parseInt(order[0]);
                int count = Integer.parseInt(order[1]);
                purchaseProduct[product - 1] = product;
                purchaseCount[product - 1] += count;
            }
        }
    }

    private static void printPurchase(int[] purchaseProduct, int[] purchaseCount, String[] products, int[] prices) {
        System.out.println("Ваша корзина: ");
        for (int i = 0; i < purchaseProduct.length; i++) {
            int index = purchaseProduct[i] - 1;
            int count = purchaseCount[i];
            if(index >= 0 && count >= 0) {
                System.out.println(products[index] + " "
                        + count + " шт " + prices[index] + " руб/шт "
                        + (count * prices[index]) + " руб в сумме");
            }
        }
    }

    public static void printProducts(String[] products, int[] prices) {
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
    }

    public static void printOption() {
        System.out.println("Выберите товар и количество или введите `end`");
    }
}

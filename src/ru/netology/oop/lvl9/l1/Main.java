package ru.netology.oop.lvl9.l1;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> clients = new PriorityQueue<>();
        clients.addAll(firstClients);
        while (!clients.isEmpty()) {
            String name = clients.poll();
            System.out.println("Клиент: " + name);
            System.out.println("Услуга оказана.");
            if (Math.random() < 0.5) {
                clients.add("friend of " + name);
                System.out.println("Добавлен друг: " + name);
            }
        }
    }
}

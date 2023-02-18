package ru.netology.osvovy.lvl1.hw5;

/**
 * @author: Baeva Nastasia
 */
public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy", 2);
        Author orwell = new Author("George", "Orwell", 4);
        Book book1 = new Book("War and Piece", 1902, tolstoy, 1200);
        Book book2 = new Book("1984", 1951, orwell, 10 );

        System.out.println(book1.isBig());
        System.out.println(book1.matches("8"));
        System.out.println(book1.matches("and"));
        System.out.println(book1.matches("toy"));
        System.out.println(book1.estimatePrice());

        System.out.println(book2.isBig());
        System.out.println(book2.matches("8"));
        System.out.println(book2.matches("and"));
        System.out.println(book2.matches("org"));
        System.out.println(book2.estimatePrice());
    }
}

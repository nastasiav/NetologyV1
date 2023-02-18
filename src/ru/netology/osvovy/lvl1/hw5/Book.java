package ru.netology.osvovy.lvl1.hw5;

/**
 * @author: Baeva Nastasia
 */
public class Book {
    String title;
    int releaseYear;
    Author author;
    int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean matches (String word) {
        if (title.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int estimatePrice () {
        int price = (int) Math.floor(pages * 3 * Math.sqrt(author.rating));
        return price < 250 ? 250 : price;
    }
}

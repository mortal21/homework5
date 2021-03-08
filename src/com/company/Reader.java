package com.company;

import java.util.Random;

public class Reader {
    Book choiceBook(Book[] books) {
        return books[new Random().nextInt(books.length)];
    }

    void readBook(Book book) {
        System.out.println(book.toString());
    }

    void rating(Book book) {
        int rating = 0;
        if (book.name != null) {
            rating = book.name.replace(" ", "").length();
        } else {
            rating -= new Random().nextInt(10);
        }
        if (book.author != null) {
            rating += book.author.replace(" ", "").length();
        } else {
            rating -= new Random().nextInt(10);
        }
        if (book.serialNumber != 0) {
            rating -= book.serialNumber;
        } else {
            rating -= new Random().nextInt(10);
        }
        if (book.numberOfPages != 0) {
            rating += book.numberOfPages;
        } else {
            rating -= new Random().nextInt(10);
        }
        System.out.println("Rating of the book \"" + book.name + "\" is " + rating);
    }
}
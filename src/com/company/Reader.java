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
        int rating = book.name.replace(" ", "").length();
        if (book.author == null) {
            rating -= new Random().nextInt(10) + new Random().nextInt(10) + new Random().nextInt(10);
        } else if (book.serialNumber == 0) {
            rating += book.author.replace(" ", "").length() - new Random().nextInt(10) - new Random().nextInt(10);
        } else if (book.numberOfPages == 0) {
            rating += book.author.replace(" ", "").length() - book.serialNumber - new Random().nextInt(10);
        } else {
            rating += book.author.replace(" ", "").length() - book.serialNumber + book.numberOfPages;
        }
        System.out.println("Rating of the book \"" + book.name + "\" is " + rating);
    }
}
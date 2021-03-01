package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird");
        Book book2 = new Book("The Captain's Daughter", "Alexander Pushkin");
        Book book3 = new Book("War and Peace", "Leo Tolstoy", 6);
        Book book4 = new Book( "Dead Souls", "Nikolai Gogol",10, 256);
        Book[] arrayOfBooks = {book1, book2, book3, book4};
        Reader reader = new Reader();
        Book randomBook = reader.choiceBook(arrayOfBooks);
        reader.readBook(randomBook);
        reader.rating(randomBook);
    }
}
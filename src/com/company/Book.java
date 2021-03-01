package com.company;

public class Book {
    String name;
    String author;
    int serialNumber;
    int numberOfPages;

    Book(String name) {
        this.name = name;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name, String author, int serialNumber) {
        this.name = name;
        this.author = author;
        this.serialNumber = serialNumber;
    }

    Book(String name, String author, int serialNumber, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.serialNumber = serialNumber;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", serialNumber=" + serialNumber +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
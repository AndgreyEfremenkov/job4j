package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code" , 68);
        Book headFirstJava = new Book("Head first java" , 708);
        Book theCompleteReferenceJava = new Book("The Complete Reference Java" , 1377);
        Book headFirstDesignPatterns = new Book("Head First Design Patterns" , 647);

        Book[] books = new Book[4];

        books[0] = cleanCode;
        books[1] = headFirstJava;
        books[2] = theCompleteReferenceJava;
        books[3] = headFirstDesignPatterns;

        for (int index=0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        Book book = books[0];
        books[0] = books[3];
        books[3] = book;

        System.out.println("Replace books[3] and books[0]");
        for (int index=0; index < books.length; index++) {
            book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Search book - Clean Code");
        for (int index=0; index < books.length; index++) {
            book = books[index];
            if (book.getName() == "Clean Code")
            System.out.println(book.getName() + " - " + book.getPages());
        }
    }
}

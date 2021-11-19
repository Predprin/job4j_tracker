package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", 750);
        Book book2 = new Book("Clean code", 464);
        Book book3 = new Book("Effective Java", 800);
        Book book4 = new Book("Java Philosophy", 600);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Replace books[0] to books[3]");
        Book bk = books[0];
        books[0] = books[3];
        books[3] = bk;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}

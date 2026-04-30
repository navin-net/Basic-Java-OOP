package navin.com.java.constructors.homework;


import navin.com.java.constructors.Book;

import java.util.Scanner;

public class H_BookService {

    private Units units = new Units();
    private final Scanner scanner = new Scanner(System.in);

    public H_Book[] createBook(int n){
        H_Book[] h_books = new H_Book[n];
        for (int i = 0; i < n; i++) {
            h_books[i] = createBook();
        }
        return  h_books;
    }

    public H_Book createBook(){

        Integer id = units.getInteger("Input id");
        String name = units.getString("Input Name");
        Double price = units.getDouble("input Double");

        H_Book h_book = new H_Book(id,name,price);

        return h_book;
    }

    public void print(H_Book[] h_books){
        for (H_Book h_book : h_books){
            System.out.println(h_book.toString());
        }
    }



}

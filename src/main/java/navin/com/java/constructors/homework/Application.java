package navin.com.java.constructors.homework;

public class Application {

     public  static void main(String[] args) {

         int numberOfBook = 1;
         H_BookService h_bookService = new H_BookService();
         H_Book[] h_books = h_bookService.createBook(numberOfBook);
//         private Units units = new Units();
         h_bookService.print(h_books);

    }

}

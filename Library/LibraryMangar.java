import java.util.Scanner;
import Library.Library;
import Library.Book;

public class LibraryMangar {
    private Library library;

    public LibraryMangar() {
        library = new Library();
    }

    public int addBookWithDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Book ID : ");
        String id = scan.nextLine();
        System.out.print("Enter Book Title : ");
        String title = scan.nextLine();
        System.out.print("Enter Author : ");
        String author = scan.nextLine();
        System.out.print("Enter Generation : ");
        String genre = scan.nextLine();
        System.out.print("Enter Pice : ");
        double price = scan.nextDouble();

        Book book = new Book(id, title, author, genre, price);
        library.addBook(book);
        return 1;
    }

    public static void main(String[] args) {
        LibraryMangar libraryMangar = new LibraryMangar();

        System.out.println(libraryMangar.addBookWithDetails());
    }
}

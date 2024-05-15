package Library;

public class Book {
    private String bookId, title, author, genre;
    private double price;
    private boolean available;

    public Book(String bookId, String title, String author, String genre, double price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.available = true;
    }
}

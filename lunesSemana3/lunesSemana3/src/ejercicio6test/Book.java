package ejercicio6test;

public class Book extends LibraryItem{
    private String author;

    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("* Author: %s\n", author);
    }
}

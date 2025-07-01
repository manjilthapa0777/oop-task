class BookBase {
    String title, author;

    BookBase(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends BookBase {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends BookBase {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends BookBase {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class Book {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("Harry Potter", "J.K. Rowling");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Effective Java", "Joshua Bloch");

        System.out.println("Fiction Book:");
        fb.displayDetails();

        System.out.println("\nNon-Fiction Book:");
        nfb.displayDetails();

        System.out.println("\nTechnical Book:");
        tb.displayDetails();
    }
}
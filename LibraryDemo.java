class LibraryBook {
    String title;
    String author;
    int totalCopies;
    int borrowedCopies;

    LibraryBook(String bookTitle, String bookAuthor, int copies) {
        title = bookTitle;
        author = bookAuthor;
        totalCopies = copies;
        borrowedCopies = 0; 
    }

    void borrowBook() {
        if (borrowedCopies < totalCopies) {
            borrowedCopies++;
            System.out.println("✅ '" + title + "' borrowed successfully.");
        } else {
            System.out.println("❌ '" + title + "' is out of stock!");
        }
    }

    void returnBook() {
        if (borrowedCopies > 0) {
            borrowedCopies--;
            System.out.println("📖 '" + title + "' returned successfully.");
        } else {
            System.out.println("⚠ No copies borrowed to return!");
        }
    }

    void displayBookInfo() {
        System.out.println("\n📚 Book Details 📚");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Available Copies: " + (totalCopies - borrowedCopies));
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 3);
        LibraryBook book2 = new LibraryBook("Python Basics", "Guido van Rossum", 2);

        book1.displayBookInfo();
        book2.displayBookInfo();

        book1.borrowBook();
        book1.borrowBook();
        book1.borrowBook();
        book1.borrowBook(); 

        book1.displayBookInfo();

        book1.returnBook();
        book1.displayBookInfo();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class implementation {
    Scanner sc = new Scanner(System.in);
    static int bookIdCounter = 1;
    static List<Book> books = new ArrayList<>();

    public void addBook() {
        System.out.println("Enter Author:");
        String Author = sc.nextLine();
        System.out.println("Enter Title:");
        String Title = sc.nextLine();
        System.out.println("Enter Genre: ");
        String Genre = sc.nextLine();
        System.out.println("Enter Number of Copies:");
        int Copies = sc.nextInt();

        // for (int i = 0; i < books.size(); i++) {
        // Book b = books.get(i);
        // if ( Title == b.title) {
        // System.out.println("You are trying to add some duplicate book");
        // return;
        // }
        // }
        // if(Author == " " || Title == " " || Genre == " "){
        // System.out.println("Please enter the author/title/genre");
        // return;
        // }
        if(Copies<0){
            System.out.println("Please Enter the valid copies!!");
            return;
        }

        Book newBook = new Book(bookIdCounter++, Title, Author, Genre, Copies);
        books.add(newBook);
        System.out.println("Book added Successfully!!");
    }

    public void viewBooks() {
        System.out.println("List of Books");
        if (books.size() < 1) {
            System.out.println("*******No Books in library*******");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println(b.id + ". " + b.title + " | " + b.author + " | " + b.genre + " | Copies: " + b.copies);
        }
    }

    public void searchBooks() {
        System.out.println("Search by Title/Author/Genre: ");
        String keyword = sc.nextLine().toLowerCase();
        if (keyword == "") {
            System.out.println("Please search again!!");
            return;
        }
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.title.toLowerCase().contains(keyword) ||
                    b.author.toLowerCase().contains(keyword) ||
                    b.genre.toLowerCase().contains(keyword)) {
                System.out
                        .println(b.id + ". " + b.title + " | " + b.author + " | " + b.genre + " | Copies: " + b.copies);
                found = true;
            }
            if (!found) {
                System.out.println("No matching books found ");
            }
        }
    }

    public void borrowBook() {
        System.out.println("Enter Book ID to borrow: ");
        int id = sc.nextInt();
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.id == id) {
                if (b.copies > 0) {
                    b.copies--;
                    System.out.println("Book borrow successfully ");
                } else {
                    System.out.println("Book not available ");
                }
                return;
            }
        }
        System.out.println("Book ID not found");
    }

    public void returnBook() {
        System.out.println("Enter Book Id: ");
        int id = sc.nextInt();
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.id == id) {
                b.copies++;
                System.out.println("Book returned Successfully");
                return;
            }
        }
        System.out.println("Book ID not found ");
    }

}

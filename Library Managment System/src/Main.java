import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        implementation l1 = new implementation();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("*========= Library Managment System =========*");
            System.out.println("1.Add Book");
            System.out.println("2.View Books");
            System.out.println("3.Search Book");
            System.out.println("4.Borrow Book");
            System.out.println("5.Return Book");
            System.out.println("0.exit");
            System.out.println("Enter your Choice");
            choice= sc.nextInt();

            switch (choice){
                case 1 :l1.addBook();break;
                case 2 :l1.viewBooks();break;
                case 3 :l1.searchBooks();break;
                case 4 :l1.borrowBook();break;
                case 5 :l1.returnBook();break;
                case 0:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 0);

    }
}
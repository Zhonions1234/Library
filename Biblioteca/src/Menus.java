import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menus {
    private static final Scanner scan = new Scanner(System.in);
    Library library = new Library();

    public String menuInitial() {
        ;   String choice;
            System.out.println("Main Menu");
            System.out.println();
            System.out.println("0. Exit the program");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = scan.next();

            switch (choice) {

                case "0":
                    break;
                case "1":
                    library.register();
                    break;
                case "2":
                    library.login();
                    break;
                default:
                    System.out.println("Enter a valid option:");
            }
        return choice;
    }

    public String menuBooks() {
        String choice;
        System.out.println("User");
        System.out.println();
        System.out.println("0. Exit the program");
        System.out.println("1. Change user account");
        System.out.println("2. Show Books requisited");
        System.out.println("3. Date delivery books");
        System.out.println("Library");
        System.out.println();
        System.out.println("4. Show Books in library");
        System.out.println();
        System.out.print("Enter choice: ");
        choice = scan.next();
        Library library = new Library();

        switch (choice) {
            case "0":
                break;
            case "1":
                library.changeUser();
                break;
            case "2":
                library.showBooksRequited();
                break;
            case "3":
                library.dateDelivery();
                break;
            case "4":
                library.showBooks();
                break;
            default:
                System.out.println("Enter a valid option:");
        }
        return choice;
    }


    }


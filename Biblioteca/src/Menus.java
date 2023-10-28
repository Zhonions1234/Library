import java.util.Date;
import java.util.Scanner;

public class Menus {
    private static final Scanner scan = new Scanner(System.in);

    public static String menuInitial() {
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
                    User.Register();
                    break;
                case "2":
                    User.login();
                    break;
                default:
                    System.out.println("Enter a valid option:");
            }
        return choice;
    }


    }


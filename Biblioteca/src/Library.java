import java.awt.*;
import java.util.*;
import java.util.List;

public class Library {
    private String split = "; ";
    List<Books> books = new ArrayList<>();

    public void register() {
        Scanner scan = new Scanner(System.in);
        User user = new User();
        String file = "User.txt";
        System.out.println("Register");
        System.out.println();
        System.out.println("Username");
        user.userName = scan.next();
        System.out.println("Password");
        user.password = scan.next();
        System.out.println("Name");
        user.name = scan.next();
        System.out.println("Date of Birth");
        user.dateOfBirth = scan.next();
        DataBaseTxt.writeNewUser(file, user.userName + split + user.password + split + user.name + split + user.dateOfBirth + split);

    }

    public void login() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Login");
        System.out.println();
        System.out.println("Username");
        String username = scan.next();
        System.out.println("Password");
        String password = scan.next();

        UserDataBase database = new UserDataBase();
        List<User> users = database.getAllUsers();

        int userIndex = -1;

        for (int i = 0; i < users.size(); i++) {
                if (users.get(i).userName.equals(username)) {
                    userIndex = i;
                    break;
                }
        }

        boolean isUserExist = userIndex != -1;

        if (isUserExist) {
            System.out.println("user exists");
        } else
        {
            System.out.println("user not exists");
        }

        /* else if (seeUser.equals(User.userName) && seeUser.equals(User.password)) {
                Menus.menuBooks();
        } else
            System.out.println(seeUser);

         */
    }


    public void changeUser() {
    }

    public void showBooks() {
        Scanner scan = new Scanner(System.in);
        this.books.add(new Books(1, "Nunca fiques onde já não estás!", "Manuel Clemente", "Nova era"));
        books.add(new Books(2, "elon Musk", "Elon Musk", "Nova era editora"));

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).idBooks + " " + books.get(i).nameBook);
        }
        System.out.println("Choise books you want see author");
        int choiceAuthor = scan.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).idBooks == choiceAuthor){
                System.out.println(books.get(i).author);
            }
        }
        System.out.println("Choise books you want see Publish");
        int choicePublish = scan.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).idBooks == choicePublish){
                System.out.println(books.get(i).publish);
            }
        }
        /*Books findBook = books.stream().filter(x -> x.idBooks == choice).findFirst().orElseThrow();
        System.out.println(findBook.author);
        */
    }

    public void dateDelivery() {

    }

    public void showBooksRequited() {
    }
}

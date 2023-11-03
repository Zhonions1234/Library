import java.awt.*;
import java.util.*;
import java.util.List;

public class Library {
    private String split = ";";
    private static final Scanner scan = new Scanner(System.in);
    List<Books> books = new ArrayList<>();

    User user = new User();

    private static Menus menu = new Menus();
    String userLogin = "";

    public void register() {

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
            if (users.get(i).userName.equals(username) && users.get(i).password.equals(password)) {
                userIndex = i;
                userLogin = users.get(i).userName;
                break;
            }
        }

        boolean isUserExist = userIndex != -1;

        if (isUserExist) {
            System.out.println("Login successfully");
            System.out.println();
            menu.menuBooks();
        } else {
            System.out.println("Login not successfully");
        }
        System.out.println();
    }


    public void changeUser() {
        UserDataBase database = new UserDataBase();
        List<User> users = database.getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userName.equals(userLogin)) {
            }
        }

        menu.menuBooks();
    }

    public void newBooks() {
        this.books.add(new Books(1, "Nunca fiques onde já não estás!", "Manuel Clemente", "Alma dos livros"));
        this.books.add(new Books(2, "Elon Musk", "Elon Musk",  "Objectiva"));
        this.books.add(new Books(3, "Segredos da Mente Milionária", "T. Harv Eker", "Marcador"));
        this.books.add(new Books(4, "Nunca Desistas de Ti", "Susana Teixeira", "Oficina do Livro,"));
        this.books.add(new Books(5, "Do Mil ao Milhão. Sem Cortar o Cafezinho", "Thiago Nigro", "Harper Collins Brasil"));
    }

    public void showBooks() {
        Scanner scan = new Scanner(System.in);
        newBooks();
        for (int i = 0; i < books.size(); i++) {
            System.out.println("ID: " + books.get(i).idBooks + " Books: " + books.get(i).nameBook);
        }

        System.out.println("Choice books you want see author");
        String choiceAuthor = scan.next();
        for (int i = 0; i < books.size(); i++) {
            if (String.valueOf(books.get(i).idBooks).equals(choiceAuthor)) {
                System.out.println(books.get(i).author);
            }

        }

        System.out.println("Choice books you want see Publish");
        String choicePublish = scan.next();
        for (int i = 0; i < books.size(); i++) {
            if (String.valueOf(books.get(i).idBooks).equals(choicePublish)) {
                System.out.println(books.get(i).publish);
            }
        }

        /*Books findBook = books.stream().filter(x -> x.idBooks == choice).findFirst().orElseThrow();
        System.out.println(findBook.author);
        */
        System.out.println();
        menu.menuBooks();
    }

    public void dateDelivery() {
        Menus menu = new Menus();
        menu.menuBooks();
    }

    public void showBooksRequited() {
        Menus menu = new Menus();
        menu.menuBooks();
    }
}

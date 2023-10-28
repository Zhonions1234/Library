import java.util.*;
import java.io.*;

public class User {
    private String userName;
    private String password;
    private String name;
    private Date dateOfBirth;
    private Date deliveryDate;
    int idBooksRequested;


    public User(String userName, String password, String name, Date dateOfBirth, int idBooksRequested, Date deliveryDate) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.deliveryDate = deliveryDate;
        this.idBooksRequested = idBooksRequested;

    }

    public static void Register() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> user = new ArrayList<String>();
        String file= "User.txt";
        System.out.println("Register");
        System.out.println();
        System.out.println("Username");
        String choiceUserName = scan.next();
        user.add(choiceUserName);
        System.out.println("Password");
        String choicePassWord = scan.next();
        user.add(choicePassWord);
        System.out.println("Name");
        String choiceName = scan.next();
        user.add(choiceName);
        System.out.println("Date of Birth");
        String choiceDateOfBirth = scan.next();
        user.add(choiceDateOfBirth);

        DataBaseTxt.Write(file, String.valueOf(user));

    }

    public static void login(){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> user = new ArrayList<String>();
        String file = "User.txt";
        System.out.println("Login");
        System.out.println();
        System.out.println("Username");
        String choiceUserName = scan.next();
        user.add(choiceUserName);
        System.out.println("Password");
        String choicePass= scan.next();
        user.add(choicePass);
        String seeUser = DataBaseTxt.Read(file);
        if(seeUser.isEmpty())
            System.out.println("Erro ao ler do arquivo!");
        else
            System.out.println(seeUser);



    }
}


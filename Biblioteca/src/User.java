import java.util.*;

public class User {
    String userName;
    String password;
    String name;
    String dateOfBirth;
    Date deliveryDate;
    Requested idBooksRequested;


    public User(String userName, String password, String name, String dateOfBirth) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }

    public User(Date deliveryDate, Requested idBooksRequested) {
        this.deliveryDate = deliveryDate;
        this.idBooksRequested = idBooksRequested;
    }

    public User() {

    }
}


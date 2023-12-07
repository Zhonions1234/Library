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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Requested getIdBooksRequested() {
        return idBooksRequested;
    }

    public void setIdBooksRequested(Requested idBooksRequested) {
        this.idBooksRequested = idBooksRequested;
    }
}


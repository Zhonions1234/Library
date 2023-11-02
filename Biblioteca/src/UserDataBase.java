import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDataBase {

    public List<User> getAllUsers(){
        ArrayList<User> usersLIst = new ArrayList<>();

        String file = DataBaseTxt.Read("User.txt");
        String[] splitUser = file.split("\n");

        for (int i = 0; i < splitUser.length ; i++) {
            String[] data = splitUser[i].split(";");
            User tempUser = new User(data[0],data[1],data[2],data[3]);
            usersLIst.add(tempUser);
        }

        return usersLIst;
    }
}

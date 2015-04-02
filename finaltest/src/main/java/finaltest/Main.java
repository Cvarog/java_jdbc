package finaltest;

import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Admin on 02.04.2015.
 */
public class Main {

    public static void main(String[] args) {

        DBConnector connector = new DBConnector();
        String querry = "select * from new_users";

//        System.out.println(connector.getConnection());
        int i = 0;
        User[] users = new User[20];
        try {
            Statement statement = connector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(querry);
            while (resultSet.next() && i <= 20){
                users[i] = new User();
                users[i].setName(resultSet.getString("name"));
                users[i].setSername(resultSet.getString("sername"));
                System.out.println(users[i]);
                System.out.println(users[i].hashCode());
                i++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}

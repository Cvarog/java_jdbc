package dbtest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 30.03.2015.
 */
public class Main {

    public static void main(String[] args) {

        DBWorker worker = new DBWorker();

        String querry = "select * from users";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(querry);

            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                System.out.println(id);
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

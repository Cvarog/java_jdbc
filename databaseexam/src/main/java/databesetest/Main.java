package databesetest;

import com.mysql.fabric.jdbc.FabricMySQLDriver;


import java.sql.*;

/**
 * Created by Admin on 30.03.2015.
 */
public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            System.err.println("Не удалось загрузить класс драйвера");
        }


        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {
//            System.out.println(connection.isClosed());
//            statement.execute("INSERT INTO animal(anim_name, anim_desc) VALUES ('name','desc');");
//            int res = statement.executeUpdate("UPDATE animal SET anim_name = 'New Name' WHERE id = 1;");
//            ResultSet res = statement.executeQuery("SELECT * from animal;");
//            System.out.println(res);
            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES ('name1','desc1');");
            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES ('name2','desc2');");
            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES ('name3','desc3');");
//            statement.executeBatch();
//            statement.clearBatch();
            System.out.println(statement.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

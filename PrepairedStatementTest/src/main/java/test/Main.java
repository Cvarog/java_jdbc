package test;

/**
 * Created by Admin on 31.03.2015.
 */
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Main {

    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    private final static String INSERT_NEW = "INSERT INTO dish values (?,?,?,?,?,?,?)";
    private final static String SELECT_ALL = "SELECT * from dish";

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            Вставка данных подготовленным запросом
//            preparedStatement = connection.prepareStatement(INSERT_NEW);
//            preparedStatement.setInt(1,1);
//            preparedStatement.setString(2, "New inserted title");
//            preparedStatement.setString(3, "New inserted decription");
//            preparedStatement.setFloat(4, 0.2f);
//            preparedStatement.setBoolean(5, true);
//            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
//            preparedStatement.setBlob(7, new FileInputStream("art81_small.jpg"));

            preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            List list = new ArrayList();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("title"));
                System.out.println(resultSet.getString("description"));
                System.out.println(resultSet.getFloat("rating"));
                System.out.println(resultSet.getBoolean("published"));
                System.out.println(resultSet.getDate("created"));
                System.out.println(resultSet.getBytes("icon"));


            }

//            preparedStatement.execute();
//        } catch (SQLException | FileNotFoundException e){
        } catch (SQLException e){
            e.printStackTrace();
        }


    }
}

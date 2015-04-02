package finaltest;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;


/**
 * Created by Admin on 02.04.2015.
 */
public class DBConnector {

    private Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public Connection getConnection(){
        return conn;
    }

    public DBConnector(){
        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root", "root");
//        } catch (SQLException e) {
//            System.err.println("Can't load driver");
//        }
    }



}

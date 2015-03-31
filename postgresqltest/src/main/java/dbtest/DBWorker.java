package dbtest;

import java.sql.*;


/**
 * Created by Admin on 30.03.2015.
 */
public class DBWorker {

    private final String HOST = "jdbc:postgresql://localhost:5432/testdb";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }



    public DBWorker(){

        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mgkar
 */
public abstract class DatabaseMYSQL {

 

    public static final String URL = "jdbc:mysql://163.178.107.10:3306/dbproyectoredes1?autoReconnect=true&useSSL=true";
    
    
    public static final String USER = "laboratorios";
    public static final String PASSWORD = "UCRSA.118";  

    public static Connection getConection() throws ClassNotFoundException, SQLException {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" " + e.getMessage());
        }
        return con;
    }

}

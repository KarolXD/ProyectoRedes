package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mgkar
 */
public abstract class DatabaseSQL {

    private static String driverName = "com.microsoft.sqlservers.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=TAREA3_B64543_B6587;user=karol;password=12345";
  //private static String url = "jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118";
//    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Progra;user=Karol;password=1234";
    public static Connection getConexion() throws ClassNotFoundException, SQLException {
        Connection conexion = DriverManager.getConnection(url);
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }//getConexion 
}

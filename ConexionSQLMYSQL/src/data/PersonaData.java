/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import domain.Persona;
import gui.Formulario;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PersonaData extends DatabaseMYSQL {

    public PersonaData() {
    }

    public void insert(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
        try {
            String sqlLlamada = "{CALL registrarCliente(?,?)}";//nombre del procedimiento almacenado

            Connection conexion = getConection();

            CallableStatement callableStatement = conexion.prepareCall(sqlLlamada);

            callableStatement.setString(1, carrera.getNombre());
            callableStatement.setString(2, carrera.getClave());
            callableStatement.execute();
            System.out.println("Insertado correctamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

//    public void deleteSQL(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
//        try {
//            String sqlLlamadaDe = "{CALL delete_Person(?)}";
//            Connection conexion = getConexion();
//            CallableStatement callableStatement = conexion.prepareCall(sqlLlamadaDe);
//            callableStatement.setString(1, carrera.getNombre());
//            callableStatement.execute();
//
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e);
//        }
//    }
//
//    public void updateSQL(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
//        try {
//            String sqlLlamadaMod = "{CALL update_Person(?,?,?,?,?,?)}";
//
//            Connection conexion = getConexion();
//            CallableStatement callableStatement = conexion.prepareCall(sqlLlamadaMod);
//
//            callableStatement.setString(1, carrera.getNombre());
//            callableStatement.setString(2, carrera.getClave());
//            callableStatement.setInt(5, carrera.getId());
//
//            callableStatement.execute();
//
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e);
//        }
//    }
//
//    public void consultSQL() throws ClassNotFoundException, SQLException, IOException {
//        try {
//            String sqlLlamadaRegistro = "{CALL consult_Person}";//llamo al proceso almacenado
//            Persona carrera = new Persona();
//            Statement sql = null;
//            Connection conexion = null;
//            ResultSet rs = null;
//            conexion = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");//establezco conexion
//
//            sql = conexion.createStatement();
//            rs = sql.executeQuery("SELECT * FROM  persona");
//
//            boolean r = rs.next();
//            if (rs.next()) {
////                Formulario.nombre.setText(rs.getString("nombre"));
//
//          //      Formulario.clave.setText(rs.getString("clave"));
//
//            }
//        } catch (SQLException e) {
//        }
//    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import domain.Persona;
import gui.Formulario;
import static gui.Formulario.gender;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PersonaData extends DatabaseSQL {

    public PersonaData() {
    }

    public void insertSQL(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
        try {
            String sqlLlamada = "{CALL Insert_Person(?,?,?,?,?,?)}";//nombre del procedimiento almacenado

            Connection conexion = getConexion();

            CallableStatement callableStatement = conexion.prepareCall(sqlLlamada);

            callableStatement.setString(1, carrera.getNombre());
            callableStatement.setString(2, carrera.getApellido1());
            callableStatement.setString(3, carrera.getApellido2());
            callableStatement.setString(4, carrera.getSexo());
            callableStatement.setInt(5, carrera.getEdad());
            callableStatement.setInt(6, carrera.getCedula());

            callableStatement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

    public void deleteSQL(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
        try {
            String sqlLlamadaDe = "{CALL delete_Person(?)}";
            Connection conexion = getConexion();
            CallableStatement callableStatement = conexion.prepareCall(sqlLlamadaDe);
            callableStatement.setInt(1, carrera.getCedula());
            callableStatement.execute();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void updateSQL(Persona carrera) throws ClassNotFoundException, SQLException, IOException {
        try {
            String sqlLlamadaMod = "{CALL update_Person(?,?,?,?,?,?)}";

            Connection conexion = getConexion();
            CallableStatement callableStatement = conexion.prepareCall(sqlLlamadaMod);

            callableStatement.setString(1, carrera.getNombre());
            callableStatement.setString(2, carrera.getApellido1());
            callableStatement.setString(3, carrera.getApellido2());
            callableStatement.setString(4, carrera.getSexo());
            callableStatement.setInt(5, carrera.getEdad());
            callableStatement.setInt(6, carrera.getCedula());

            callableStatement.execute();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void consultSQL() throws ClassNotFoundException, SQLException, IOException {
        try {
            String sqlLlamadaRegistro = "{CALL consult_Person}";//llamo al proceso almacenado
            Persona carrera = new Persona();
            Statement sql = null;
            Connection conexion = null;
            ResultSet rs = null;
            conexion = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");//establezco conexion

            sql = conexion.createStatement();
            rs = sql.executeQuery("SELECT * FROM  persona");

            boolean r = rs.next();
            if (rs.next()) {
                Formulario.nombre.setText(rs.getString("nombre"));

                Formulario.firstname.setText(rs.getString("apellido1"));
                Formulario.lastname.setText(rs.getString("apellido2"));
                Formulario.age.setText(rs.getString("edad"));

                gender.setSelectedItem(rs.getString("sexo"));
                Formulario.card.setText(rs.getString("cedula"));

            }
        } catch (SQLException e) {
        }
    }

}

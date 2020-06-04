package data;

import client.Client;
import data.DatabaseMYSQL;
import domain.Persona;
import gui.Login;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PersonaData extends DatabaseMYSQL {

    public PersonaData() {
        
    }   

    
    public boolean autenticacion(Persona p) throws ClassNotFoundException{
         
        try {
         Connection   conexion = getConection();
            PreparedStatement stm= conexion.prepareStatement("{ CALL login(?,?)}");
            stm.setString(1, p.getNombre());
            stm.setString(2, p.getClave());            
            ResultSet rs= stm.executeQuery();            
            Persona persona= new Persona();
    
            if(rs.next()){
                persona.setNombre(rs.getString("personacedula"));                
                persona.setClave(rs.getString("personaclave"));
                  JOptionPane.showMessageDialog(null,"Bienvenido al sistema "+persona.getNombre());
                  
                Client formu = new Client();
                formu.setVisible(true);
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Usuario y/o Clave INVALIDA");
                return false;
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
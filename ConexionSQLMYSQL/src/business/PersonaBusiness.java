/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.Persona;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class PersonaBusiness {
    
     public boolean registrarPersona (Persona p) throws ClassNotFoundException, SQLException, IOException{
      
        data.PersonaData metodos= new data.PersonaData();
        metodos.insert(p);    
    return true;
    }
    
}


package domain;


public class Persona {

    int id;
    String nombre;
    String clave;
   

    public Persona() {
    }

    public Persona(String nombre, String clave) {

        this.nombre = nombre;
        this.clave = clave;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


}


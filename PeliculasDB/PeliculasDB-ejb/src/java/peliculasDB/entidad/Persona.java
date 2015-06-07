package peliculasDB.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Persona extends EntidadPersistente {
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String email;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
}

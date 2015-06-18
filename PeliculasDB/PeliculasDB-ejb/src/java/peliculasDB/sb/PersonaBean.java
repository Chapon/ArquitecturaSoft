package peliculasDB.sb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import peliculasDB.entidad.Actor;
import peliculasDB.entidad.Critico;
import peliculasDB.entidad.Director;
import peliculasDB.entidad.Usuario;

@Stateless
@LocalBean
public class PersonaBean {

    public static List<Actor> listarActores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    public Actor crearActor(String nombre, String email, String nacionalidad) {
        Actor actor = new Actor();
        actor.setNombre(nombre);
        actor.setEmail(email);
        actor.setNacionalidad(nacionalidad);
        return actor;
    }
    
    public Critico crearCritico(String nombre, String email, String clave) {
        Critico critico = new Critico();
        critico.setNombre(nombre);
        critico.setEmail(email);
        critico.setClave(clave);
        return critico;
    }  
     
    public Director crearDirector(String nombre, String email, String nacionalidad) {
        Director director = new Director();
        director.setNombre(nombre);
        director.setEmail(email);
        director.setNacionalidad(nacionalidad);
        return director;
    }   
    
    public Usuario crearUsuario(String nombre, String email, String clave) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setClave(clave);
        return usuario;
    }
}

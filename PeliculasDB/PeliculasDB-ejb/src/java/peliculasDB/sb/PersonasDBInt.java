package peliculasDB.sb;

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
public class PersonasDBInt {
    
    @PersistenceContext
    EntityManager em;
    
    public void persistirActor(Actor a) {
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }
    
    public Director persistirDirector(Director d) {
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        return d;
    } 
    
    public void persistirActor(Critico c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }   

    public Usuario persistirUsuario(Usuario u) {
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        return u;
    } 
}

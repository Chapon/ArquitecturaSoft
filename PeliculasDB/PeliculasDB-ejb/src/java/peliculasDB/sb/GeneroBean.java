package PeliculasDB.sb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import peliculasDB.entidad.Genero;

@Singleton
@LocalBean
public class GeneroBean {

    @PersistenceContext
    private EntityManager em;

    public void agregarDirector(Genero g) {
        em.persist(g);
    }
}

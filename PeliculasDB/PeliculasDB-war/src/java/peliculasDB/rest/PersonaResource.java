package peliculasDB.rest;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;
import peliculasDB.sb.PersonaBean;
import com.google.gson.Gson;
import peliculasDB.entidad.Actor;

@Path("persona")
public class PersonaResource {
    
    @EJB
    private PersonaBean personaBean;

    @Context
    private UriInfo context;

    private Gson gson;
 
    public PersonaResource() {
        gson = new Gson();
    }

    @GET
    @Path("/crearActor")
    @Produces("application/json")
    public Response crearActor(@PathParam("nombre") String nombre, @PathParam("email") String email, @PathParam("nacionalidad") String nacionalidad) {
        try {
            Actor s = personaBean.crearActor(nombre, email, nacionalidad);            
            return Response.ok(gson.toJson(s)).build();
        }
        catch (Exception ex){
            return Response.ok(gson.toJson(ex)).build();
        }
    }
}

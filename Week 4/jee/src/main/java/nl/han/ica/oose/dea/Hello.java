package nl.han.ica.oose.dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Hello {

    @GET
    public String hello() {
        return "hello world";
    }
}

package nl.han.ica.oose.dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/customers")
public class Customerscontroller {
    List<String> customers = new ArrayList<>();

    @GET
    @Produces("application/json")
    public List<String> getCustomers(){
        customers.add("piet");
        customers.add("Willem");
        return customers;
    }
}

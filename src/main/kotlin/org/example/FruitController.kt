package org.example

import jdk.nashorn.internal.objects.Global
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/fruits")
class FruitController {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun hello(request: Fruit): String {
        return "Cool parsing done. name =${request.name}"
    }
}
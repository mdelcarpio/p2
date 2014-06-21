/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repusp.rest;
 
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo; 
import repusp.parsers.VagaJson;

/**
 *
 * @author Michelet
 */
@Path("/vagas")
public class VagasRWS {
    @Context
    private UriInfo context;
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listaVagasTxt(){
       VagaJson vj = new VagaJson();
        return vj.getVagasEAnunciantes().toString();
    }
    @GET
    @Path("/vaga")
    @Produces(MediaType.APPLICATION_JSON)
    public String primeiraVaga(){
       VagaJson vj = new VagaJson();
        return vj.getVaga().toString();
    }
    
}

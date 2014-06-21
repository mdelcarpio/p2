/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repusp.parsers;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonObject;
import repusp.daos.VagaDAO;
import repusp.entidades.Vaga;

/**
 *
 * @author Michelet
 */
public class VagaJson {
    public ArrayList<JsonObject> getVagasEAnunciantes(){
         VagaDAO vd = new VagaDAO();
        ArrayList<Vaga> vagas = vd.getAll();
        
        ArrayList<JsonObject> objetos = new ArrayList<>();
        JsonObject objeto = null;
        for(Vaga v : vagas){
            objeto = Json.createObjectBuilder()
                    .add("id", v.getId())
                    .add("custo", v.getCusto())
                    .add("local", v.getLocal())
                    .add("anunciante", Json.createObjectBuilder()
                            .add("id", v.getAnunciante().getId())
                            .add("nome",v.getAnunciante().getNome())).build();
            objetos.add(objeto);
        }
        return objetos;
    }
    public ArrayList<JsonObject> getVagas(){
         VagaDAO vd = new VagaDAO();
        ArrayList<Vaga> vagas = vd.getAll();
        
        ArrayList<JsonObject> objetos = new ArrayList<>();
        JsonObject objeto = null;
        for(Vaga v : vagas){
            objeto = Json.createObjectBuilder()
                    .add("id", v.getId())
                    .add("custo", v.getCusto())
                    .add("local", v.getLocal()).build();
            objetos.add(objeto);
        }
        return objetos;
    }
}

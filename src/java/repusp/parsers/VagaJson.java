/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repusp.parsers;


import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import restjpa.entidades.Vaga;
import restjpa.dao.VagaJpaController;

/**
 *
 * @author Michelet
 */
public class VagaJson {
    public ArrayList<JsonObject> getVagasEAnunciantes(){
         
        ArrayList<Vaga> vagas = new ArrayList<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestJPAPU");
        VagaJpaController dao = new VagaJpaController(emf);
        vagas.addAll(dao.findVagaEntities());
        
        ArrayList<JsonObject> objetos = new ArrayList<>();
        JsonObject objeto = null;
        for(Vaga v : vagas){
            objeto = Json.createObjectBuilder()
                    .add("id", v.getId())
                    .add("custo", v.getCusto())
                    .add("bairro", v.getBairro())
                    .add("contato", Json.createObjectBuilder()
                            .add("id", v.getContato().getId())
                            .add("nome",v.getContato().getNome())
                            .add("email",v.getContato().getEmail() )
                    
                    ).build();
            objetos.add(objeto);
        }
        return objetos;
    }
    public ArrayList<JsonObject> getVagas(){
         
        ArrayList<Vaga> vagas = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestJPAPU");
        VagaJpaController dao = new VagaJpaController(emf);
        vagas.addAll(dao.findVagaEntities());
        
        ArrayList<JsonObject> objetos = new ArrayList<>();
        JsonObject objeto = null;
        for(Vaga v : vagas){
            objeto = Json.createObjectBuilder()
                    .add("id", v.getId())
                    .add("custo", v.getCusto())
                    .add("local", v.getBairro())
                    .add("endereco", v.getEndereco()
                       
                    ).build();
            objetos.add(objeto);
        }
        return objetos;
    }
}

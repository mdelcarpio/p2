/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repusp.testes;

import java.util.ArrayList; 
import restjpa.entidades.Contato;
import restjpa.entidades.Vaga;

/**
 *
 * @author Michelet
 */
public class ListaVagas {
    public static ArrayList<Vaga> Vagas;
    static {
        Vagas = new ArrayList<>();
        Vaga v = null;
        Contato a = null;
        for (int i = 0; i<10; i++){
            v = new Vaga();
            a = new Contato();
            v.setContato(a);
            Vagas.add(v);
        }
    }
    
    
}

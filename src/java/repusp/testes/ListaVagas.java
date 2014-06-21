/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repusp.testes;

import java.util.ArrayList;
import repusp.entidades.Anunciante;
import repusp.entidades.Vaga;

/**
 *
 * @author Michelet
 */
public class ListaVagas {
    public static ArrayList<Vaga> Vagas;
    static {
        Vagas = new ArrayList<>();
        Vaga v = null;
        Anunciante a = null;
        for (int i = 0; i<10; i++){
            v = new Vaga(i, Math.random()*100, "Local"+ i);
            a = new Anunciante((long)i, "Anunciante "+i);
            v.setAnunciante(a);
            Vagas.add(v);
        }
    }
    
    
}

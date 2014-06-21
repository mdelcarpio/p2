/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repusp.entidades;

/**
 *
 * @author Michelet
 */
public class Vaga {
    private Anunciante anunciante;
    private long id;
    private double custo;
    private String local;

    public Vaga(int id, double custo, String  local){
        this.id = id;
        this.custo = custo;
        this.local = local;
    }
    public Vaga(int id, double custo, String  local, Anunciante anunciante){
        this.id = id;
        this.custo = custo;
        this.local = local;
        this.anunciante = anunciante;
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the anunciante
     */
    public Anunciante getAnunciante() {
        return anunciante;
    }

    /**
     * @param anunciante the anunciante to set
     */
    public void setAnunciante(Anunciante anunciante) {
        this.anunciante = anunciante;
    }
}

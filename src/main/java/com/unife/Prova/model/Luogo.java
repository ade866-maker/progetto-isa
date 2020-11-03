/**
 * Classe relativa alla tabella "Luogo" definita nel database.
 * La classe è definita dalla chiave primaria "ID" e dai campi "Citta",
 * "Via" e "N_civico". Vengono quindi definiti i metodi GET e SET relativi ai
 * vari campi dove nei SET vengono definiti una serie di controlli che saranno
 * soggetti a test di Junit.
 */
package com.unife.Prova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "luogo")
public class Luogo implements Serializable{
    
    @Id
    private Integer id;
    private String Citta;
    private String Via;
    private Integer N_civico;

    public Integer getId() {
        return id;
    }
    
    public String getCitta() {
        return Citta;
    }
    
    public String getVia() {
        return Via;
    }

    public Integer getN_civico() {
        return N_civico;
    }

    public void setId(Integer id) {
         if(id <=0){
            throw new IllegalArgumentException("LuogoId deve essere > 0.");
        }
        this.id = id;
    }
    
    public void setCitta(String Citta) {
        if(Citta.length() > 100) {
            throw new IllegalArgumentException("La Città può avere max 100 caratteri.");
        }
        this.Citta = Citta;
    }

    public void setVia(String Via) {
        if(Via.length() > 100) {
            throw new IllegalArgumentException("La via può avere max 100 caratteri.");
        }
        this.Via = Via;
    }

    public void setN_civico(Integer N_civico) {
        if(N_civico <=0){
            throw new IllegalArgumentException("N_civico deve essere > 0.");
        }
        this.N_civico = N_civico;
    }
}
/**
 * Classe per la definizione della chiave primaria composta costituita dagli 
 * attributi "id_persona", "id_libreria" e "Data_acquisto" attraverso il
 * metodo dell'ID class
 */
package com.unife.Prova.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;


public class Compraid implements Serializable {
    
    @Column(name="id_persona")
    private Integer id_persona;
    @Column(name="id_libreria")
    private Integer id_libreria;
    @Column(name="Data_acquisto")
    private String Data_acquisto;

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public Integer getId_libreria() {
        return id_libreria;
    }

    public void setId_libreria(Integer id_libreria) {
        this.id_libreria = id_libreria;
    }

    public String getData_acquisto() {
        return Data_acquisto;
    }

    public void setData_acquisto(String Data_acquisto) {
        this.Data_acquisto = Data_acquisto;
    }
    public Compraid(){}
    public Compraid(Integer id_persona, Integer id_libreria, String Data_acquisto) {
        this.id_persona = id_persona;
        this.id_libreria = id_libreria;
        this.Data_acquisto = Data_acquisto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.getId_persona());
        hash = 17 * hash + Objects.hashCode(this.getId_libreria());
        hash = 17 * hash + Objects.hashCode(this.getData_acquisto());
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compraid other = (Compraid) obj;
        if (!Objects.equals(this.Data_acquisto, other.Data_acquisto)) {
            return false;
        }
        if (!Objects.equals(this.id_persona, other.id_persona)) {
            return false;
        }
        if (!Objects.equals(this.id_libreria, other.id_libreria)) {
            return false;
        }
        return true;
    }
}

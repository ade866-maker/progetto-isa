/**
 * Classe relativa alla tabella "Compra" definita nel database.
 * La classe è definita da una chiave primaria composta costituita da 
 * "Id_persona", "Id_libreria" e "Data_acquisto" e dai campi "Costo_totale" e
 * "Numero_libri". Vengono quindi definiti i metodi GET e SET relativi ai vari
 * campi dove nei SET vengono definiti una serie di controlli che saranno
 * soggetti a test di Junit.
 */
package com.unife.Prova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(Compraid.class)
@Table(name = "compra")
public class Compra implements Serializable {
    
    @Id
    private Integer id_persona;
    @Id
    private Integer id_libreria;
    @Id
    private String Data_acquisto;
    private Integer Costo_totale;
    private Integer Numero_libri;
    
    
    public Integer getId_persona() {
        return id_persona;
    }
    public Integer getId_libreria() {
        return id_libreria;
    }
    public String getData_acquisto() {
        return Data_acquisto;
    }
    public Integer getCosto_totale() {
        return Costo_totale;
    }
    public Integer getNumero_libri() {
        return Numero_libri;
    }

    public void setId_persona(Integer id_persona) {
        if(id_persona <=0){
            throw new IllegalArgumentException("Id_persona deve essere > 0.");
        }
        this.id_persona = id_persona;
    }

    public void setId_libreria(Integer id_libreria) {
        if(id_libreria <=0){
            throw new IllegalArgumentException("Id_libreria deve essere > 0.");
        }
        this.id_libreria = id_libreria;
    }

    public void setCosto_totale(Integer Costo_totale) {
        if(Costo_totale <0){
            throw new IllegalArgumentException("Il costo totale deve essere positivo.");
        }
        this.Costo_totale = Costo_totale;
    }

    public void setNumero_libri(Integer Numero_libri) {
        if(Numero_libri < 0 || Numero_libri > 3000) {
            throw new IllegalArgumentException("Il numero di libri deve essere compreso fra 0 e 3000.");
        }
        this.Numero_libri = Numero_libri;
    }
    
    public void setData_acquisto(String Data_acquisto) {
        this.Data_acquisto = Data_acquisto;
    }
}

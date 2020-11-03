/**
 * Classe relativa alla tabella "Libreria" definita nel database.
 * La classe è definita dalla chiave primaria "ID" e dai campi "Id_luogo" (chiave
 * esterna che fa riferimento alla chiave primaria "ID" definita nella tabella 
 * "Luogo"), "Nome_libro", "Numero_copie" e "Costo". Vengono quindi definiti i
 * metodi GET e SET relativi ai vari campi dove nei SET vengono definiti una
 * serie di controlli che saranno soggetti a test di Junit.
 */
package com.unife.Prova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libreria")
public class Libreria implements Serializable {
    
    @Id
    private Integer id;
    private Integer id_luogo;
    private String Nome_libro;
    private Integer Numero_copie;
    private Integer Costo;

    public Integer getId() {
        return id;
    }

    public Integer getId_luogo() {
        return id_luogo;
    }

    public String getNome_libro() {
        return Nome_libro;
    }
    
    public Integer getNumero_copie() {
        return Numero_copie;
    }
    
    public Integer getCosto() {
        return Costo;
    }
    
    public void setId(Integer id) {
        if(id <=0){
            throw new IllegalArgumentException("LibreriaId deve essere > 0.");
        }
        this.id = id;
    }
    
    public void setId_luogo(Integer id_luogo) {
        if(id_luogo <=0){
            throw new IllegalArgumentException("LuogoId deve essere > 0.");
        }
        this.id_luogo = id_luogo;
    }

    public void setNome_libro(String Nome_libro) {
        if(Nome_libro.length() > 100) {
            throw new IllegalArgumentException("Il nome del libro può avere max 100 caratteri.");
        }
        this.Nome_libro = Nome_libro;
    }
    
    public void setNumero_copie(Integer Numero_copie) {
        if(Numero_copie < 0 || Numero_copie > 3000) {
            throw new IllegalArgumentException("Il numero di libri deve essere compreso fra 0 e 3000.");
        }
        this.Numero_copie = Numero_copie;
    }
    
    public void setCosto(Integer Costo) {
        if(Costo <0){
            throw new IllegalArgumentException("Il costo deve essere positivo.");
        }
        this.Costo = Costo;
    }
}




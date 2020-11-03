/**
 * Classe relativa alla tabella "Libro" definita nel database.
 * La classe è definita dalla chiave primaria "ID" e dai campi "Titolo",
 * "Autore", "Genere" e "Anno_pubblicazione". Vengono quindi definiti i metodi
 * GET e SET relativi ai vari campi dove nei SET vengono definiti una serie di
 * controlli che saranno soggetti a test di Junit.
 */
package com.unife.Prova.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro implements Serializable {
    
    @Id
    @Column(name="id")
    private Integer id;
    private String Titolo;
    private String Autore;
    private String Genere;
    private Integer Anno_Pubblicazione;
    
    public Integer getId() {
        return id;
    }
    
    public String getTitolo() {
        return Titolo;
    }

    public String getGenere() {
        return Genere;
    }
    
    public Integer getAnno_Pubblicazione() {
        return Anno_Pubblicazione;
    }
    
    public String getAutore() {
        return Autore;
    }

    public void setGenere(String Genere) {
        if(Genere.length() > 100) {
            throw new IllegalArgumentException("Il genere può avere max 100 caratteri.");
        }
        this.Genere = Genere;
    }

    public void setAnno_Pubblicazione(Integer Anno_Pubblicazione) {
        if(Anno_Pubblicazione < 0 || Anno_Pubblicazione > 3000) {
            throw new IllegalArgumentException("Anno pubblicazione libro deve essere compreso fra 0 e 3000.");
        }
        this.Anno_Pubblicazione = Anno_Pubblicazione;
    }
    
    public void setId(Integer id) {
        if(id <=0){
            throw new IllegalArgumentException("LibroId deve essere > 0.");
        }
        this.id = id;
    }

    public void setTitolo(String Titolo) {
        if(Titolo.length() > 100) {
            throw new IllegalArgumentException("Il titolo può avere max 100 caratteri.");
        }
        this.Titolo = Titolo;
    }

    public void setAutore(String Autore) {
        if(Autore.length() > 100) {
            throw new IllegalArgumentException("L'autore può avere max 100 caratteri.");
        }
        this.Autore = Autore;
    }
}

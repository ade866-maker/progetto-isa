/**
 * Classe relativa alla tabella "Persona" definita nel database.
 * La classe è definita dalla chiave primaria "ID" e dai campi "Nome_Cognome",
 * "Sesso", "Cellulare" e "Email". Vengono quindi definiti i metodi
 * GET e SET relativi ai vari campi dove nei SET vengono definiti una serie di
 * controlli che saranno soggetti a test di Junit.
 */
package com.unife.Prova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    private Integer id;
    private String Nome_Cognome;
    private char Sesso;
    private String Cellulare;
    private String Email;
    
    public Integer getId() {
        return id;
    }
    
    public String getNome_Cognome() {
        return Nome_Cognome;
    }
    
    public char getSesso() {
        return Sesso;
    }
    
    public String getCellulare() {
        return Cellulare;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setNome_Cognome(String Nome_Cognome) {
        if(Nome_Cognome.length() > 100) {
            throw new IllegalArgumentException("Il Nome e cognome possono avere max 100 caratteri.");
        }
        this.Nome_Cognome = Nome_Cognome;
    }

    public void setId(Integer id) {
        if(id <=0){
            throw new IllegalArgumentException("LibroId deve essere > 0.");
        }
        this.id = id;
    }

    public void setSesso(char Sesso) {
        if(Sesso!='M' && Sesso!='F'){
            throw new IllegalArgumentException("Il sesso deve essere 'M' o 'F'");
        }
        this.Sesso = Sesso;
    }

    public void setCellulare(String Cellulare) {
        if(Cellulare.length()>10){
            throw new IllegalArgumentException("Cellulare deve essere > 0.");
        }
        this.Cellulare = Cellulare;
    }

    public void setEmail(String Email) {
        if(Email.length() > 100) {
            throw new IllegalArgumentException("L'email può avere max 100 caratteri.");
        }
        this.Email = Email;
    }
}

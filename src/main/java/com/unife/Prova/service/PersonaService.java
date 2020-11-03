/**
 * Interfaccia contenente i metodi definiti dalla classe "Persona".
 * Tali metodi consentono di inserire un nuova persona, restituire la lista delle
 * persone, ricercare una persona tramite ID e cancellare una persona 
 * attraverso un ID.
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Persona;
import java.util.List;
import java.util.Optional;


public interface PersonaService {
    public void savepersona(Persona n);
    public List<Persona> getAll();
    public Optional<Persona> findById(Integer personaId);
    public void deletepersona(Integer id);
}

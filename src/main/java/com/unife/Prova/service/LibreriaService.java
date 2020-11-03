/**
 * Interfaccia contenente i metodi definiti dalla classe "Libreria".
 * Tali metodi consentono di creare un nuova libreria, restituire la lista delle
 * librerie, ricercare una libreria tramite ID e cancellare una libreria 
 * attraverso un ID.
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Libreria;
import java.util.List;
import java.util.Optional;

public interface LibreriaService {
    public void savelibreria(Libreria n);
    public List<Libreria> getAll();
    public Optional<Libreria> findById(Integer libreriaId);
    public void deleteLibreria(Integer id);
}

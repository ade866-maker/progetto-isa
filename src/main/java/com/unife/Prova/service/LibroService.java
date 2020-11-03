/**
 * Interfaccia contenente i metodi definiti dalla classe "Libro".
 * Tali metodi consentono di creare un nuovo, restituire la lista dei
 * libri, ricercare un libro tramite ID e cancellare uno libro 
 * attraverso un ID.
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Libro;
import java.util.List;
import java.util.Optional;


public interface LibroService {
    public void savelibro(Libro n);
    public List<Libro> getAll();
    public Optional<Libro> findById(Integer libroId);
    public void deleteLibro(Integer id);
}

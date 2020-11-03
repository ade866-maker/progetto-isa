/**
 * Implementazione dei metodi definiti nell'interfaccia "LibroService".
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Libro;
import com.unife.Prova.repository.LibriRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Libriservice")
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibriRepository libriRepository;
    
    @Override
    public void savelibro(Libro n) {
        libriRepository.save(n);
    }

    @Override
    public List<Libro> getAll() {
       return libriRepository.findAll();
    }

    @Override
    public Optional<Libro> findById(Integer libroId) {
        return libriRepository.findById(libroId);
    }

    @Override
    public void deleteLibro(Integer id) {
        libriRepository.deleteById(id);
    }
    
}

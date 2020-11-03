/**
 * Implementazione dei metodi definiti nell'interfaccia "LibreriaService".
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Libreria;
import com.unife.Prova.repository.LibreriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Libreriaservice")
public class LibreriaServiceImpl implements LibreriaService {
    
    @Autowired
    private LibreriaRepository libreriaRepository;
    
    @Override
    public void savelibreria(Libreria n) {
        libreriaRepository.save(n);
    }

    @Override
    public List<Libreria> getAll() {
       return libreriaRepository.findAll();
    }

    @Override
    public Optional<Libreria> findById(Integer libreriaId) {
        return libreriaRepository.findById(libreriaId);
    }

    @Override
    public void deleteLibreria(Integer id) {
        libreriaRepository.deleteById(id);
    }
    
}

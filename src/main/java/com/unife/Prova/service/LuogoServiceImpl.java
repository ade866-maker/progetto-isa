/**
 * Implementazione dei metodi definiti nell'interfaccia "LuogoService".
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Luogo;
import com.unife.Prova.repository.LuogoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("Luogoservice")
public class LuogoServiceImpl implements LuogoService {
    @Autowired
    private LuogoRepository luogoRepository;
    
    @Override
    public void saveluogo(Luogo n) {
        luogoRepository.save(n);
    }

    @Override
    public List<Luogo> getAll() {
       return luogoRepository.findAll();
    }

    @Override
    public Optional<Luogo> findById(Integer luogoId) {
        return luogoRepository.findById(luogoId);
    }

    @Override
    public void deleteLuogo(Integer id) {
        luogoRepository.deleteById(id);
    }
    
}

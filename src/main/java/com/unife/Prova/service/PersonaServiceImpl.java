/**
 * Implementazione dei metodi definiti nell'interfaccia "PersonaService".
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Persona;
import com.unife.Prova.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("Personaservice")
public class PersonaServiceImpl implements PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public void savepersona(Persona n) {
        personaRepository.save(n);
    }

    @Override
    public List<Persona> getAll() {
       return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> findById(Integer personaId) {
        return personaRepository.findById(personaId);
    }

    @Override
    public void deletepersona(Integer id) {
        personaRepository.deleteById(id);
    }
    
}

package com.unife.Prova.repository;

import com.unife.Prova.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("personarepository")
public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}

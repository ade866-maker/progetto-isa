package com.unife.Prova.repository;

import com.unife.Prova.model.Libreria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("libreriarepository")
public interface LibreriaRepository extends JpaRepository<Libreria,Integer> {
}

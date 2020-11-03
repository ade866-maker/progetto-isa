package com.unife.Prova.repository;

import com.unife.Prova.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("librirepository")
public interface LibriRepository extends JpaRepository<Libro,Integer> {
}


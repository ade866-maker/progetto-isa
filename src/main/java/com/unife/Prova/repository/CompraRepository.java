package com.unife.Prova.repository;

import com.unife.Prova.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("comprarepository")
public interface CompraRepository extends JpaRepository<Compra,Integer> {  
}

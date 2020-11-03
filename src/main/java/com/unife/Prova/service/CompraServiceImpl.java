/**
 * Implementazione dei metodi definiti nell'interfaccia "CompraService".
 */
package com.unife.Prova.service;


import com.unife.Prova.model.Compra;
import com.unife.Prova.repository.CompraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Compraservice")
public class CompraServiceImpl implements CompraService {
       
    @Autowired
    private CompraRepository compraRepository;
    
    @Override
    public void savecompra(Compra n) {
        compraRepository.save(n);
    }

    @Override
    public List<Compra> getAll() {
       return compraRepository.findAll();
    }

    /*@Override
    public Optional<Compra> findById(Integer compraId) {
        return compraRepository.findById(compraId);
    }

    @Override
    public void deleteCompra(Integer id) {
        compraRepository.deleteById(id);
    }
    */
}

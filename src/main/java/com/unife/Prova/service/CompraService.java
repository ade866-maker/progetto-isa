/**
 * Interfaccia contenente i metodi definiti dalla classe "Compra".
 * Tali metodi consentono di creare un nuovo ordine, restituire la lista degli
 * ordini, ricercare un ordine tramite ID e cancellare un ordine attraverso un
 * ID. E' bene notare che gli ultimi due metodi sono stati definiti ma non
 * ancora implementati.
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Compra;
import java.util.List;
import java.util.Optional;



public interface CompraService {
    public void savecompra(Compra n);
    public List<Compra> getAll();
    /*public Optional<Compra> findById(Integer compraId);
    public void deleteCompra(Integer id);*/
}

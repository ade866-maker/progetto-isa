/**
 * Interfaccia contenente i metodi definiti dalla classe "Luogo".
 * Tali metodi consentono di inserire una nuova locazione di libreria,
 * restituire la lista delle locazioni relative allelibrerie presenti,
 * ricercare una locazione tramite ID e cancellare una locazione attraverso
 * un ID.
 */
package com.unife.Prova.service;

import com.unife.Prova.model.Luogo;
import java.util.List;
import java.util.Optional;


public interface LuogoService {
    public void saveluogo(Luogo n);
    public List<Luogo> getAll();
    public Optional<Luogo> findById(Integer luogoId);
    public void deleteLuogo(Integer id);
}

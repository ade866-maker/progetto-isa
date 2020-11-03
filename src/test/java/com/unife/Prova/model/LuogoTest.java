/**
 * Test eseguito con Junit relativo alla classe "Luogo": si occupa di testare
 * attraverso valori validi e non il corretto funzionamento delle operazioni
 * di SET definite nella classe stessa.
 */
package com.unife.Prova.model;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.unife.Prova.utils.InvalidStringGenerator;
import com.unife.Prova.utils.StringGenerator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class LuogoTest {
    
    @BeforeClass
    public static void printName() {
        System.out.println("[Unit test] LuogoTest-Avvio");
    }
    @AfterClass
    public static void tearDownClass() {
        System.out.println("[Unit test] LuogoTest-Fine");
    }
/**
 * Viene testato l'inserimento di un numero maggiore di 0 prendendo dapprima
 * in input un numero negativo e poi un numero positivo.
 */    
    @Property(trials = 50)
    public void testSetId(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Luogo().setId(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Luogo().setId(positiveId);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
/**
 * Viene testato l'inserimento di una stringa: nello specifico viene definita
 * valida una stringa con max 50 caratteri mentre è invalida una stringa con
 * un numero di caratteri superiore, tali stringhe vengono rispettivamente
 * generate dalle classi "StringGenerator" ed "InvalidStringGenerator".
 */
    @Property(trials = 50)
    public void testSetCitta(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Luogo().setCitta(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Luogo().setCitta(valid);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
/**
 * Viene testato l'inserimento di una stringa: nello specifico viene definita
 * valida una stringa con max 50 caratteri mentre è invalida una stringa con
 * un numero di caratteri superiore, tali stringhe vengono rispettivamente
 * generate dalle classi "StringGenerator" ed "InvalidStringGenerator".
 */
    @Property(trials = 50)
    public void testSetVia(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Luogo().setVia(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Luogo().setVia(valid);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
/**
 * Viene testato l'inserimento di un numero maggiore di 0 prendendo dapprima
 * in input un numero negativo e poi un numero positivo.
 */   
    @Property(trials = 50)
    public void testSetN_civico(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Luogo().setN_civico(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Luogo().setN_civico(positiveId);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
    
}

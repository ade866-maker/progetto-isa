/**
 * Test eseguito con Junit relativo alla classe "Persona": si occupa di testare
 * attraverso valori validi e non il corretto funzionamento delle operazioni
 * di SET definite nella classe stessa.
 */
package com.unife.Prova.model;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.unife.Prova.utils.InvalidNumberGenerator;
import com.unife.Prova.utils.InvalidStringGenerator;
import com.unife.Prova.utils.NumberGenerator;
import com.unife.Prova.utils.StringGenerator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class PersonaTest {
    @BeforeClass
    public static void printName() {
        System.out.println("[Unit test] PersonaTest-Avvio");
    }
    @AfterClass
    public static void tearDownClass() {
        System.out.println("[Unit test] PersonaTest-Fine");
    }
/**
 * Viene testato l'inserimento di una stringa: nello specifico viene definita
 * valida una stringa con max 50 caratteri mentre è invalida una stringa con
 * un numero di caratteri superiore, tali stringhe vengono rispettivamente
 * generate dalle classi "StringGenerator" ed "InvalidStringGenerator".
 */
    @Property(trials = 50)
    public void testSetNome_Cognome(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Persona().setNome_Cognome(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Persona().setNome_Cognome(valid);
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
    public void testSetId(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Persona().setId(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Persona().setId(positiveId);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
/**
 * Viene testato l'inserimento di un numero avente 10 cifre. Attraverso l'
 * inserimento di un numero dapprima con un numero di cifre maggiori di 10 e
 * poi con un numero di cifre esattamente 10
 */
    @Property(trials = 50)
    public void testSetCellulare(@From(InvalidNumberGenerator.class) String invalid, @From(NumberGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Persona().setCellulare(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Persona().setCellulare(valid);
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
    public void testSetEmail(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Persona().setEmail(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Persona().setEmail(valid);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
    
}

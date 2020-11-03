/**
 * Test eseguito con Junit relativo alla classe "Libro": si occupa di testare
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
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class LibroTest {
    
    @BeforeClass
    public static void printName() {
        System.out.println("[Unit test] LibroTest-Avvio");
    }
    @AfterClass
    public static void tearDownClass() {
        System.out.println("[Unit test] LibroTest-Fine");
    }
/**
 * Viene testato l'inserimento di una stringa: nello specifico viene definita
 * valida una stringa con max 50 caratteri mentre è invalida una stringa con
 * un numero di caratteri superiore, tali stringhe vengono rispettivamente
 * generate dalle classi "StringGenerator" ed "InvalidStringGenerator".
 */    
    @Property(trials = 50)
    public void testSetGenere(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Libro().setGenere(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Libro().setGenere(valid);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
/**
 * Viene testato l'inserimento di un numero che dovrà essere ritenuto valido
 * unicamente se rientra nel range 0<numero<3000. Negli altri casi il numero
 * non è valido
 */     
    @Property(trials = 33)
    public void testSetAnno_Pubblicazione(@InRange(maxInt = -1) int lower, @InRange(minInt = 3001) int upper, @InRange(minInt = 0, maxInt = 3000) int valid) {
        IllegalArgumentException e1 = null;
        try {
            new Libro().setAnno_Pubblicazione(lower);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Libro().setAnno_Pubblicazione(upper);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNotNull(e2);

        IllegalArgumentException e3 = null;
        try {
            new Libro().setAnno_Pubblicazione(valid);
        } catch (IllegalArgumentException ex) {
            e3 = ex;
        }
        assertNull(e3);
    }
/**
 * Viene testato l'inserimento di un numero maggiore di 0 prendendo dapprima
 * in input un numero negativo e poi un numero positivo.
 */
    @Property(trials = 50)
    public void testSetId(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Libro().setId(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Libro().setId(positiveId);
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
    public void testSetTitolo(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Libro().setTitolo(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Libro().setTitolo(valid);
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
    public void testSetAutore(@From(InvalidStringGenerator.class) String invalid, @From(StringGenerator.class) String valid) {
        IllegalArgumentException e1 = null;
        try {
            new Libro().setAutore(invalid);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Libro().setAutore(valid);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }
}

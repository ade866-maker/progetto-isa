/**
 * Test eseguito con Junit relativo alla classe "Compra": si occupa di testare
 * attraverso valori validi e non il corretto funzionamento delle operazioni
 * di SET definite nella classe stessa.
 */
package com.unife.Prova.model;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


@RunWith(JUnitQuickcheck.class)
public class CompraTest {
    
    @BeforeClass
    public static void printName() {
        System.out.println("[Unit test] CompraTest-Avvio");
    }
    @AfterClass
    public static void tearDownClass() {
        System.out.println("[Unit test] CompraTest-Fine");
    }
/**
 * Viene testato l'inserimento di un numero maggiore di 0 prendendo dapprima
 * in input un numero negativo e poi un numero positivo.
 */
    @Property(trials = 50)
    public void testSetId_persona(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Compra().setId_persona(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Compra().setId_persona(positiveId);
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
    public void testSetId_libreria(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Compra().setId_libreria(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Compra().setId_libreria(positiveId);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNull(e2);
    }

    /*
    @Test
    public void testSetData_acquisto() {
        System.out.println("setData_acquisto");
        String Data_acquisto = "";
        Compra instance = new Compra();
        instance.setData_acquisto(Data_acquisto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
/**
 * Viene testato l'inserimento di un numero maggiore di 0 prendendo dapprima
 * in input un numero negativo e poi un numero positivo.
 */
    @Property(trials = 50)
    public void testSetCosto_totale(@InRange(maxInt = 0) int negativeId, @InRange(minInt = 1) int positiveId) {
        IllegalArgumentException e1 = null;
        try {
            new Compra().setCosto_totale(negativeId);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Compra().setCosto_totale(positiveId);
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
    public void testSetNumero_libri(@InRange(maxInt = -1) int lower, @InRange(minInt = 3001) int upper, @InRange(minInt = 0, maxInt = 3000) int valid) {
        IllegalArgumentException e1 = null;
        try {
            new Compra().setNumero_libri(lower);
        } catch (IllegalArgumentException ex) {
            e1 = ex;
        }
        assertNotNull(e1);

        IllegalArgumentException e2 = null;
        try {
            new Compra().setNumero_libri(upper);
        } catch (IllegalArgumentException ex) {
            e2 = ex;
        }
        assertNotNull(e2);

        IllegalArgumentException e3 = null;
        try {
            new Compra().setNumero_libri(valid);
        } catch (IllegalArgumentException ex) {
            e3 = ex;
        }
        assertNull(e3);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gael CHENEVIER
 * @version 1.0
 */
public class VisiteurIT {
    
    public VisiteurIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Visiteur.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Visiteur instance = new Visiteur();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Visiteur.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Visiteur instance = new Visiteur();
        instance.setId(id);
        
    }

    /**
     * Test of getNom method, of class Visiteur.
     */
    @org.junit.Test
    public void testGetNom() {
        System.out.println("getNom");
        Visiteur instance = new Visiteur();
        String expResult = null;
        String result = instance.getNom();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNom method, of class Visiteur.
     */
    @org.junit.Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Visiteur instance = new Visiteur();
        instance.setNom(nom);
        
    }

    /**
     * Test of getPrenom method, of class Visiteur.
     */
    @org.junit.Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Visiteur instance = new Visiteur();
        String expResult = null;
        String result = instance.getPrenom();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPrenom method, of class Visiteur.
     */
    @org.junit.Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Visiteur instance = new Visiteur();
        instance.setPrenom(prenom);
        
    }

    /**
     * Test of getAdresse method, of class Visiteur.
     */
    @org.junit.Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        Visiteur instance = new Visiteur();
        String expResult = null;
        String result = instance.getAdresse();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAdresse method, of class Visiteur.
     */
    @org.junit.Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        String adresse = "";
        Visiteur instance = new Visiteur();
        instance.setAdresse(adresse);
        
    }

    /**
     * Test of getCodeP method, of class Visiteur.
     */
    @org.junit.Test
    public void testGetCodeP() {
        System.out.println("getCodeP");
        Visiteur instance = new Visiteur();
        int expResult = 0;
        int result = instance.getCodeP();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCodeP method, of class Visiteur.
     */
    @org.junit.Test
    public void testSetCodeP() {
        System.out.println("setCodeP");
        int codeP = 0;
        Visiteur instance = new Visiteur();
        instance.setCodeP(codeP);
        
    }

}

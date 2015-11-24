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
public class VehiculeIT {
    
    public VehiculeIT() {
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
     * Test of getMarque method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetMarque() {
        System.out.println("getMarque");
        Vehicule instance = new Vehicule();
        String expResult = null;
        String result = instance.getMarque();
        assertEquals(expResult, result);

    }

    /**
     * Test of getModele method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetModele() {
        System.out.println("getModele");
        Vehicule instance = new Vehicule();
        String expResult = null;
        String result = instance.getModele();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getPrix method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Vehicule instance = new Vehicule();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
   
    }

    /**
     * Test of setMarque method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetMarque() {
        System.out.println("setMarque");
        String marque = "";
        Vehicule instance = new Vehicule();
        instance.setMarque(marque);
   
    }

    /**
     * Test of setModele method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetModele() {
        System.out.println("setModele");
        String modele = "";
        Vehicule instance = new Vehicule();
        instance.setModele(modele);
   
    }

    /**
     * Test of setPrix method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        Vehicule instance = new Vehicule();
        instance.setPrix(prix);
       
    }

    /**
     * Test of getId method, of class Vehicule.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Vehicule instance = new Vehicule();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setId method, of class Vehicule.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Vehicule instance = new Vehicule();
        instance.setId(id);
      
    }
    
    /**
     * Test of getPrixMajore method, of class Vehicule.
     */
    @Test
    public void testGetPrixMajore() {
        System.out.println("getPrixMajore");
        Vehicule instance = new Vehicule();
        instance.setMarque("Renault");
        if(instance.getMarque().equals("Renault")){
            double expResult = instance.getPrix()*1.10;
            double result = instance.getPrixMajore();
        }else{
            if(instance.getMarque().equals("Peugeot")){
                double expResult = instance.getPrix()*1.05;
                double result = instance.getPrixMajore();
            }
        }
        double expResult = instance.getPrix();
        double result = instance.getPrixMajore(); 
        assertEquals(expResult, result, 0.0);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 *
 * @author Gael
 */
  public class Init {
        private static Init uniqueInstance;
        private Init(){}
        public static synchronized Init getInstance() {
            if (uniqueInstance == null){
                uniqueInstance = new Init();
            }
            return uniqueInstance;
        }
        
    public void chargementinitial(){    
     Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
     Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
     Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
     Visiteur visiteur1 = new Visiteur(1, "CR", "Gaël","22 rue de la république" , 42000);
     Visiteur visiteur2 = new Visiteur(2, "Zambelli", "Andréa", "1 Allée des moineaux", 42340);
     Visiteur visiteur3 = new Visiteur(3,"Ibars", "Sofiane", "2 Rue de l'anneau", 42600);
    }
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     */ 
    public void encoderXML(){
        System.out.println("FICHIER CREE !");
         Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
     Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
     Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
        XMLEncoder encoder = null;
        try{
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("vehicule.xml")));
            encoder.writeObject(vehicule1);
            encoder.writeObject(vehicule2);
            encoder.writeObject(vehicule3);
            encoder.flush();
        }catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (encoder != null){
                encoder.close();
            }
        }
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     */ 
     public void encoder2XML(){
          Visiteur visiteur1 = new Visiteur(1, "CR", "Gaël","22 rue de la république" , 42000);
     Visiteur visiteur2 = new Visiteur(2, "Zambelli", "Andréa", "1 Allée des moineaux", 42340);
     Visiteur visiteur3 = new Visiteur(3,"Ibars", "Sofiane", "2 Rue de l'anneau", 42600);
        XMLEncoder encoder = null;
        try{
            encoder = new XMLEncoder(new BufferedOutputStream(
            new FileOutputStream("visiteur.xml")));
            encoder.writeObject(visiteur1);
            encoder.writeObject(visiteur2);
            encoder.writeObject(visiteur3);
            encoder.flush();
        }catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (encoder != null){
                encoder.close();
            }
        }
    }
    
     /**
      * @author Gael CHENEVIER
      * @version 1.0
      */
    public void decoderXML(){
        
        XMLDecoder decoder = null;
        try {
     decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("vehicule.xml")));
     final Vehicule vehicule = (Vehicule) decoder.readObject();
     System.out.println(vehicule);
    } catch (final Exception e){
        e.printStackTrace();
    }finally{
            if(decoder != null){
            decoder.close();
            }
        }
    }
    
      /**
      * @author Gael CHENEVIER
      * @version 1.0
      */
    public void decoder2XML(){
        
        XMLDecoder decoder = null;
        try {
     decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("visiteur.xml")));
     final Visiteur visiteur = (Visiteur) decoder.readObject();
     System.out.println(visiteur);
    } catch (final Exception e){
        e.printStackTrace();
    }finally{
            if(decoder != null){
            decoder.close();
            }
        }
    }

    }

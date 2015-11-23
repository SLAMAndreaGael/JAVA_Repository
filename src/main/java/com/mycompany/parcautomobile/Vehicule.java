/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import java.util.List;


/**
 *
 * @author Gael CHENEVIER
 * @version 1.0
 */
public class Vehicule {

    private int id;
    private String marque;
    private String modele;
    private double prix;
    private static BeanItemContainer<Vehicule> vehicules = new BeanItemContainer<Vehicule>(Vehicule.class);
    
    
    public Vehicule() {
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @param id id du vehicule
     * @param marque marque du vehicule
     * @param modele modèle du vehicule
     * @param prix  prix du vehicule
     */
    public Vehicule(int id, String marque, String modele, double prix) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.vehicules.addBean(this);
    }
    
    /**
     * @author Gael CHENEVIER
     * @return marque du vehicule
     */
    public String getMarque() {
        return marque;
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @return modele du vehicule
     */
    public String getModele() {
        return modele;
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @return prix du vehicule
     */
    public double getPrix() {
        return prix;
    }
   
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @param marque initialise la marque du vehicule 
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @param modele initialise le modele du vehicule 
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @param prix initialise le prix du vehicule
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
 
    /**
     * @author Gael CHENEVIEER
     * @version 1.0
     * @return l'id du vehicule
     */
    public int getId() {
        return id;
    }

    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @param id initialise l'id du vehicule
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @author Gael CHENEVIER
     * @return collection de vehicules 
     */
    public static BeanItemContainer<Vehicule> getVehicules(){
    
       return vehicules;
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     */
    public static BeanItemContainer<Vehicule> getVehiculesPrixBas() {
        
        BeanItemContainer<Vehicule> vehiculesPrixBas = new BeanItemContainer<Vehicule>(Vehicule.class);
        List<Vehicule> listeVehicule = (List<Vehicule>)vehicules.getItemIds();
        
         for (Vehicule vehicule : listeVehicule) {
             
            if( (vehicule.getPrix()) <= 15000 ){
                 vehiculesPrixBas.addBean(vehicule);     
            }
         }
        return vehiculesPrixBas;
    }
}

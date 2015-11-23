/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;

/**
 * @version 1.0
 * @author Gael CHENEVIER
 */
public class Visiteur {
    
    //id,nom,prénom,adresse,cp
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int codeP;
    private static BeanItemContainer<Visiteur> visiteurs = new BeanItemContainer<>(Visiteur.class);
    
    public Visiteur() {
        
    }
    
    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @param id id du visiteur
     * @param nom nom du visiteur
     * @param prenom prenom du visiteur
     * @param adresse adresse du visiteur
     * @param codeP code postal du visiteur
     */
    public Visiteur(int id, String nom, String prenom, String adresse, int codeP){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codeP = codeP;
        this.visiteurs.addBean(this);
    }

    /**
     * @return id du visiteur
     */
    public int getId() {
        return id;
    }

    /**
     * @param id set l'id du visiteur
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return nom du visiteur
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom set nom du visiteur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return prenom du visiteur
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom initialise le prenom du visiteur
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return adresse du visiteur
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse initialise l'adresse du visiteur
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return code postale du visiteur
     */
    public int getCodeP() {
        return codeP;
    }

    /**
     * @param codeP initialise le code postale du visiteur
     */
    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }
    /**
     * @author Gael CHENEVIER
     * @return collection de visiteurs
     */
    public static BeanItemContainer<Visiteur> getVisiteurs() {
        return visiteurs; 
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

/**
 *
 * @author Gael
 */
public class SerializerVisiteurXML {
    
      public static void main(final String argv[]) {
        final Visiteur visiteur1 = new Visiteur(1, "CR", "Gaël","22 rue de la république" , 42000);
        final Visiteur visiteur2 = new Visiteur(2, "Zambelli", "Andréa", "1 Allée des moineaux", 42340);
        final Visiteur visiteur3 = new Visiteur(3,"Ibars", "Sofiane", "2 Rue de l'anneau", 42600);
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
    
}

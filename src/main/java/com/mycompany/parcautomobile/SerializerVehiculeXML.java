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
public class SerializerVehiculeXML {
    
    public static void main(final String argv[]) {
        final Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
        final Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
        final Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005); 
       XMLEncoder encoder = null;
        
        try{
            encoder = new XMLEncoder(new BufferedOutputStream(
            new FileOutputStream("vehicule.xml")));
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
}

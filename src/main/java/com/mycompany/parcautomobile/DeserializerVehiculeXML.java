/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
/**
 *
 * @author Gael
 */
public class DeserializerVehiculeXML {
    
    public static void main(final String argv[])
    {
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
}


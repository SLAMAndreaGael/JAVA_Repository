package com.mycompany.parcautomobile;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.client.widget.grid.selection.SelectionEvent;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.SelectionEvent.SelectionListener;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;

/**
 *
 */
@Theme("mytheme")
@Widgetset("com.mycompany.parcautomobile.MyAppWidgetset")
public class MyUI extends UI {

    private Grid contactList = new Grid();
    private Grid contactListE = new Grid();
    private Grid contactListD = new Grid();
    private Table contactTable = new Table();
    

    @Override
    protected void init(VaadinRequest vaadinrequest) {
        configureComponents();  // configuration des composants
        buildLayout();          //  construction de la vue
        
    }

    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @return configuration des tableaux des résultats des différentes fonction des classes Vehicule et Visiteur.
     */
    private void configureComponents() {

        contactList.setContainerDataSource(Vehicule.getVehicules());

        //contactTable.setContainerDataSource(new BeanItemContainer<>( Vehicule.class));
        contactList.setColumnOrder("marque", "modele", "prix","carburant");  // choisir l'ordre des colonnes
        contactList.removeColumn("id"); // masquer la colonne
        //  contactList.setSelectionMode(Grid.SelectionMode.SINGLE);
        contactList.setSizeFull();

        contactListE.setContainerDataSource(Vehicule.getVehiculesEssence());

       // contactTable.setContainerDataSource(new BeanItemContainer<>( Vehicule.class));
        contactListE.setColumnOrder("marque", "modele", "prix", "carburant");  // choisir l'ordre des colonnes
        contactListE.removeColumn("id");
        //  contactList.setSelectionMode(Grid.SelectionMode.SINGLE);
        contactListE.setSizeFull();
        
       contactListD.setContainerDataSource(Vehicule.getVehiculesDiesel());

       // contactTable.setContainerDataSource(new BeanItemContainer<>( Vehicule.class));
        contactListD.setColumnOrder("marque","modele", "prix", "carburant");  // choisir l'ordre des colonnes
        contactListD.removeColumn("id");
        //  contactList.setSelectionMode(Grid.SelectionMode.SINGLE);
        contactListD.setSizeFull();
        
   
   Init uniqueinstance=Init.getInstance();
    uniqueinstance.chargementinitial();  

   
    }

    /**
     * @author Gael CHENEVIER
     * @version 1.0
     * @return affichage des tableaux des résultats des fonctions des classes Visiteur et Vehicule
     */
    private void buildLayout() {

        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        // ajouts de composants
        layout.addComponent(new Label("Parc de véhicule"));
        layout.addComponent(contactList);
        layout.addComponent(new Label("Véhicules Essence"));
        layout.addComponent(contactListE);
        layout.addComponent(new Label("Véhicules Diesel"));
        layout.addComponent(contactListD);
        //layout.addComponent(contactTable);
        setContent(layout);  // affectation de la vue
       
    }


    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
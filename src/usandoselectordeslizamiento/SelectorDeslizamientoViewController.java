/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandoselectordeslizamiento;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 * FXML Controller class
 *
 * @author Angel
 */
public class SelectorDeslizamientoViewController implements Initializable 
{

    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private SelectorDeslizamiento selectorAbajo;
    @FXML
    private Label lbfinal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        lista.add("Seis");
        lista.add("Siete");
        lista.add("Ocho");
        lista.add("Nueve");
        lista.add("Diez");
        
        selectorArriba.setItems(lista);
        selectorAbajo.setItems(lista);          
    }    

    @FXML
    private void actionArriba(ActionEvent event) 
    {
        lbfinal.setText("Pulsado selector de arriba");
    }

    @FXML
    private void actionAbajo(ActionEvent event) 
    {
        lbfinal.setText("Pulsado selector de abajo");
    }
    
}

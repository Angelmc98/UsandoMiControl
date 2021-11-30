/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Angel
 */
public class AppUsoTextoBotonController implements Initializable {

    @FXML
    private CampoTextoBoton botonNombre;
    @FXML
    private CampoTextoBoton botonApellidos;
    @FXML
    private Label lbfinal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    
    
    @FXML
    private void onActionSuperior(ActionEvent event)
    {
        lbfinal.setText(botonNombre.getText());
    }
    
    @FXML
    private void onActionInferior(ActionEvent event)
    {
        lbfinal.setText(botonApellidos.getText());
    }
    
    
}

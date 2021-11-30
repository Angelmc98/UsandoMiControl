/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandotemporizador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import temporizador.Temporizador;

/**
 * FXML Controller class
 *
 * @author Angel
 */
public class UsandoTemporizadorController implements Initializable {

    @FXML
    private Temporizador temporizador;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
     label.setText("Voy a cambiar");
    }    

    @FXML
    private void onAction(ActionEvent event) 
    {
        label.setText("He cambiado");
    }
    
}

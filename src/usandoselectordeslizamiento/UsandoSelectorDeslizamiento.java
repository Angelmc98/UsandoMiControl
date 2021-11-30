/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandoselectordeslizamiento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Angel
 */
public class UsandoSelectorDeslizamiento extends Application {
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/usandoselectordeslizamiento/SelectorDeslizamientoView.fxml"));
        VBox vbox = fxmlLoader.load();
        Scene scene = new Scene(vbox);
        
        stage.setTitle("Usando mis controles - Selector deslizamiento");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

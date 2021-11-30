/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandocampotextonumerico;

import campotextonumerico.CampoTextoNumerico;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Angel Medina Cantos
 */
public class UsandoCampoTextoNumerico extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
        StackPane root = new StackPane();
        // Añadimos la escena al root
        Scene scene = new Scene(root, 300, 250);
        
        //Creamos el boton
        CampoTextoNumerico campotextonumerico = new CampoTextoNumerico();
        
        
        //Añadimos el boton al root
        root.getChildren().add(campotextonumerico);
        
        primaryStage.setTitle("UsandoMisControles - CampoTextoNumerico");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

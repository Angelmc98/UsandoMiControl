/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandocampotextoboton;

import campotextoboton.CampoTextoBoton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Angel
 */
public class UsandoCampoTextoBoton extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        // Añadimos la escena al root
        Scene scene = new Scene(root, 300, 250);
        
        //Creamos el boton
        CampoTextoBoton campotextoboton = new CampoTextoBoton();
        campotextoboton.setText("Hola");
        
        //Añadimos el boton al root
        root.getChildren().add(campotextoboton);
        
        primaryStage.setTitle("UsandoMisControles - CampoTextoBoton");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
    
}

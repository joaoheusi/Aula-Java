/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhorelacionado;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author joaomheusi
 */
public class TrabalhoRelacionado extends Application{

    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        VBox root;
        root =  FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml"));
        Scene scene = new Scene(root, 300, 250);
        root.setSpacing(10);
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public static void main(String[] args){
            launch(args);
     }// TODO code application logic here

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhorelacionado;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
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
    public void start(Stage primaryStage) {
        Label finalLabel = new Label("Resultado: ");
        Label label1 = new Label("Numero 1:");
        Label label2 = new Label("Numero 2:");
        TextField textField1 = new TextField ();
        TextField textField2 = new TextField ();
        HBox hb = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();
        
        Button soma = new Button("Somar");
        soma.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                finalLabel.setText("Resultado: "+(num1+ num2));
            }
            });
        Button sub = new Button("Subtrair");
        sub.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                finalLabel.setText("Resultado: "+(num1 - num2));
            }
            });
        Button mult = new Button("Multiplicar");
        mult.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                finalLabel.setText("Resultado: "+(num1 * num2));
            }
            });
        Button div = new Button("Dividir");
        div.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                finalLabel.setText("Resultado: "+(num1/ num2));
            }
            });
        
        hb.getChildren().addAll(label1,textField1);
        hb.setSpacing(10);
        hb2.getChildren().addAll(label2,textField2);
        hb2.setSpacing(10);
        hb3.getChildren().addAll(soma,sub,mult,div);
        hb3.setSpacing(10);
        VBox root = new VBox();
        root.getChildren().addAll(hb,hb2);
        root.getChildren().add(finalLabel);
        root.getChildren().add(hb3);
        root.setSpacing(10);
        root.snappedRightInset();
        root.snappedBottomInset();
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
  

    }
     public static void main(String[] args){
            launch(args);
     }// TODO code application logic here

}

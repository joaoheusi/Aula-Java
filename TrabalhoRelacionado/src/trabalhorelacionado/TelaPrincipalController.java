/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhorelacionado;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import static javax.management.Query.value;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author joaomheusi
 */
public class TelaPrincipalController implements Initializable {
    
    public double a, b, c;
    @FXML private Label labl1;
    @FXML private TextField f1;
    @FXML private TextField f2;
    @FXML private TextField f3;
    @FXML private HBox boxNum1;
    @FXML private HBox boxNum2;
    @FXML private HBox boxNum3;
    @FXML private HBox boxBotoes;
    
    
    
    public TelaPrincipalController(){
    }
    public void PadraoH(){
        boxNum1.setSpacing(10);
        boxNum2.setSpacing(10);
        boxBotoes.setSpacing(10);
        
    }
    
    @FXML
    public void ativarPL(){       
       try{
         a = Double.parseDouble(f1.getText());
         b = Double.parseDouble(f2.getText());
         
        }catch(NumberFormatException ex){
}
        labl1.setText("Resultado: " + (2*a+2*b)+"cm");
    }
    @FXML
    public void ativarPT(){
        //try{
         a = Double.parseDouble(f1.getText());
         b = Double.parseDouble(f2.getText());
         c = Double.parseDouble(f3.getText());
       // }catch(NumberFormatException ex){
//}
        labl1.setText("Resultado: " + (2*b+2*c)+"cm");
    }
    @FXML
    public void ativarAL(){
        try{
         a = Double.parseDouble(f1.getText());
         b = Double.parseDouble(f2.getText());
         c = Double.parseDouble(f3.getText());
        }catch(NumberFormatException ex){
}
        labl1.setText("Resultado: " + (a*b) + "cmˆ2");
    }
    @FXML
    public void ativarAT(){
        try{
         a = Double.parseDouble(f1.getText());
         b = Double.parseDouble(f2.getText());
         c = Double.parseDouble(f3.getText());
        }catch(NumberFormatException ex){
}
        labl1.setText("Resultado: " + (b*c) + "cmˆ2");
    }
    @FXML
    public void ativarV(){
        try{
         a = Double.parseDouble(f1.getText());
         b = Double.parseDouble(f2.getText());
         c = Double.parseDouble(f3.getText());
        }catch(NumberFormatException ex){
}
        labl1.setText("Resultado: " + (a*b*c)+"cmˆ3");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PadraoH();

 // The user entered an invalid number, report the error
}
        // TODO
    }    
    

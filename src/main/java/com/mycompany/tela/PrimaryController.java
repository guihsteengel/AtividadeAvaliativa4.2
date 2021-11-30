package com.mycompany.tela;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import javafx.scene.control.Button;

public class PrimaryController {

   ObservableList lista=FXCollections.observableArrayList();
    Pilha pi = new Pilha(11);
    int ult = pi.retornaTopo();
    int i = -1;

    String getText;
    
    @FXML
    private TextField campoEmpilhar;

    @FXML
    private TextField campoDesempilhar;
    
    @FXML
    private Label Lbl1;
    
    @FXML
    private Label Lbl2;
    
    @FXML
    private Label Lbl3;
    
    @FXML
    private Label Lbl4;
    
    @FXML
    private Label Lbl5;
    
    @FXML
    private Button Empilhar;
    
     @FXML
    private Button Desempilhar;
    

    @FXML
    private void Empilhar() throws IOException {
        if(i<5) {
            No n = new No(campoEmpilhar.getText());
            pi.empilha(n);
            ult= pi.retornaTopo();
            campoEmpilhar.getText();
            getText = (campoEmpilhar.getText());  
            i++;
            campoEmpilhar.clear();
            campoEmpilhar.requestFocus();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("A pilha está cheia");
            alert.setContentText("Se a pilha não estiver cheia, tente novamente!");
            alert.show();
            campoEmpilhar.clear();
        }
    }

    @FXML
    private void Desempilhar() throws IOException, ExcecaoPilhaVazia {
       try {
            pi.desempilha();
            ult= pi.retornaTopo();
            if(pi.toString() != null) {
            campoDesempilhar.getText();
            getText = (campoDesempilhar.getText());  
            }
            i--;
       }catch(ExcecaoPilhaVazia e) {
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Erro");
           alert.setHeaderText("A pilha pode estar vazia");
           alert.setContentText(e.getMessage());
           alert.show();
       }

    }

   
}
        
  
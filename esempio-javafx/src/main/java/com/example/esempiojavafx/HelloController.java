package com.example.esempiojavafx;

import com.example.esempiojavafx.model.Registro;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addPersonaButton;

    @FXML
    private Label personeLabel;

    @FXML
    private TextField nomeTextField;

    @FXML
    protected void onAddPersonaButtonClick() {
        if(nomeTextField.getText().equals("")){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Errore");
            a.setContentText("Non hai inserito il nome");
            a.show();
        }else{
            Registro.getInstance().addPersona(nomeTextField.getText());
            personeLabel.setText(Registro.getInstance().getNomiPersone());
//        welcomeText.setText("Welcome to JavaFX Application!");
        }
    }



}
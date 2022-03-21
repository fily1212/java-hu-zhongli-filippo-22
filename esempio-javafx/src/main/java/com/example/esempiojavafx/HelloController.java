package com.example.esempiojavafx;

import com.example.esempiojavafx.model.Registro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addPersonaButton;

    @FXML
    private Label personeLabel;

    @FXML
    protected void onAddPersonaButtonClick() {
        Registro.getInstance().addPersona("Pippo");
        personeLabel.setText(Registro.getInstance().getNomiPersone());
//        welcomeText.setText("Welcome to JavaFX Application!");
    }



}
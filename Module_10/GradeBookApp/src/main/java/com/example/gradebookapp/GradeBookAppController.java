package com.example.gradebookapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class GradeBookAppController implements Initializable {
    @FXML
    private ComboBox<String> boxGrade;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        boxGrade.getItems().setAll("A", "B", "C", "D", "F");
    }
}
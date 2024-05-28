package com.example.gradebookapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static com.example.gradebookapp.SaveIO.dataInsert;
import static com.example.gradebookapp.SaveIO.dataRetrieval;

public class GradeBookAppController implements Initializable {
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtCourse;
    @FXML
    private ComboBox<String> boxGrade;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnView;
    @FXML
    private Button btnSave;
    @FXML
    private TextArea viewGrade;

    @FXML
    protected void onBtnClearClick() {
        txtFirstName.clear();
        txtLastName.clear();
        txtCourse.clear();
        boxGrade.setValue(null);
    }
    @FXML
    protected void onBtnViewClick() throws IOException {
        String view = "";
        ArrayList<String> data = dataRetrieval();

        for (String obj : data)
            view = view + obj + "\n";

        viewGrade.setText(view);
    }

    @FXML
    protected void onBtnSaveClick() throws IOException {
        dataInsert(txtFirstName.getText(), txtLastName.getText(), txtCourse.getText(), boxGrade.getValue());
    }

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        boxGrade.getItems().setAll("A", "B", "C", "D", "F");
    }
}

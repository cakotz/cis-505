package com.example.enhancedfuturevalueapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class EnhancedFutureValueAppController implements Initializable {
    @FXML
    private TextField txtMonthlyPayment;
    @FXML
    private TextField txtInterestRate;
    @FXML
    private TextArea textArea;
    @FXML
    private Label lblDate;
    @FXML
    private ComboBox<Integer> boxYears;

    @FXML
    protected void onBtnClearClick() {
        clearFormFields();
    }

    @FXML
    protected void onBtnCalculateClick() {
        calculateResults();
    }

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        boxYears.getItems().setAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private void clearFormFields() {
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        textArea.setText("");
        lblDate.setText("");
        boxYears.setValue(0);
    }

    private void calculateResults() {
        double monthlyPayment = parseDouble(txtMonthlyPayment.getText());
        double interestRate = parseDouble(txtInterestRate.getText());
        int years = boxYears.getValue();

        double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, interestRate, years);

        textArea.setText("The future value is $" + futureValue);

        lblDate.setText("Calculation as of " + todaysDate());
    }

    private String todaysDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String formattedDate = date.format(formatter);

        return formattedDate;
    }

}
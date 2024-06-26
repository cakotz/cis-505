package com.example.futurevalueapp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KotzFutureValueApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        /*
        TextField txtMonthlyPayment - Allows the user to input the monthly payment.
        TextField txtInterestRate - Allows the user to input the interest rate.
        TextArea textArea - Displays the future value of the payment based in interest and the number of years.
         */
        TextField txtMonthlyPayment = new TextField();
        TextField txtInterestRate = new TextField();

        TextArea textArea = new TextArea();

        //Creates labels to instruct the user where to enter data and how to format data.
        Label lblMonthlyPayment = new Label("Monthly Payment:");
        Label lblInterestRate = new Label("Interest Rate:");
        Label lblYears = new Label("Years:");
        Label lblInstructions = new Label("Enter 11.1% as 11.1");

        //Allows the user to select a number of year from one to 10.
        ComboBox<Integer> boxYears = new ComboBox<>(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        /*
        Button btnClear - Clears the TextFields and the TextArea.
        Button btnCalculate - Calculates the future value using the user input.
         */
        Button btnClear = new Button("Clear");
        Button btnCalculate = new Button("Calculate");

        //Creates a GridPane object to hold the controls.
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        //Adds the controls to the GridPane object.
        gridPane.add(lblMonthlyPayment, 0, 0);gridPane.add(txtMonthlyPayment, 1 ,0);
        gridPane.add(lblInterestRate, 0, 1); gridPane.add(txtInterestRate, 1, 1);

        gridPane.add(lblInstructions, 1, 2);
        lblInstructions.setTextFill(Color.RED);
        GridPane.setHalignment(lblInstructions, HPos.RIGHT);

        gridPane.add(lblYears, 0, 3); gridPane.add(boxYears, 1, 3);

        //Creates an HBox object and adds the two Button objects to it and then adds the HBox to the GridPane.
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        gridPane.add(actionBtnContainer, 1, 4);

        gridPane.add(textArea, 0, 5);

        //Sets the title of the Stage and sets the scene using the GridPane object.
        primaryStage.setTitle("Kotz Future Value App");
        primaryStage.setScene(new Scene(gridPane, 700, 380));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
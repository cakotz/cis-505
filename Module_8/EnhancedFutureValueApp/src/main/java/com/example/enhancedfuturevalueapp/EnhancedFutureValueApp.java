package com.example.enhancedfuturevalueapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EnhancedFutureValueApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EnhancedFutureValueApp.class.getResource("EnhancedFutureValueApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 500);
        stage.setTitle("Future Value App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
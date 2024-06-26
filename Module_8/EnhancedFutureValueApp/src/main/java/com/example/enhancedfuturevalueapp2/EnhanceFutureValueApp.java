package com.example.enhancedfuturevalueapp2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EnhancedFutureValueApp2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EnhancedFutureValueApp2.class.getResource("EnhancedFutureValueApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 500);
        stage.setTitle("Future Value App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
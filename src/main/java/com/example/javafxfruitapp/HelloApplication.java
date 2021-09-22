package com.example.javafxfruitapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Favorite fruit");

        // Setup the Stage and Scene
        FlowPane rootFlowPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        Scene scene = new Scene(rootFlowPane, 400, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
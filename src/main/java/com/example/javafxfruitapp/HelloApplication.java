package com.example.javafxfruitapp;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler {
    private Label title;
    private Label response;
    private Label selected;

    private CheckBox bananaCheckBox;
    private CheckBox mangoCheckBox;
    private CheckBox grapesCheckBox;
    private CheckBox orangeCheckBox;

    private String fruits;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Favorite fruit");

        title = new Label("What fruits do you like?");
        response = new Label("");
        selected = new Label("");

        bananaCheckBox = new CheckBox("Banana");
        mangoCheckBox = new CheckBox("Mango");
        grapesCheckBox = new CheckBox("Grapes");
        orangeCheckBox = new CheckBox("Orange");

        // Setup the Stage and Scene
        FlowPane rootFlowPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        rootFlowPane.setAlignment(Pos.CENTER);

        // Add controls
        rootFlowPane.getChildren().add(title);
        rootFlowPane.getChildren().addAll(bananaCheckBox, mangoCheckBox, grapesCheckBox, orangeCheckBox, response, selected);

        // Attach evenListeners to checkboxes
        bananaCheckBox.setOnAction(this);
        mangoCheckBox.setOnAction(this);
        grapesCheckBox.setOnAction(this);
        orangeCheckBox.setOnAction(this);

        Scene scene = new Scene(rootFlowPane, 400, 250);
        stage.setScene(scene);
        stage.show();

        showAll();
    }

    void showAll() {
        fruits = "";
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(Event event) {
        Object fruitChecked = event.getSource();
        System.out.println(fruitChecked);
        if (bananaCheckBox.equals(fruitChecked)) {
            if (bananaCheckBox.isSelected()) {
                response.setText("Banana selected");
            } else {
                response.setText("Banana rejected");
            }
        }
    }
}
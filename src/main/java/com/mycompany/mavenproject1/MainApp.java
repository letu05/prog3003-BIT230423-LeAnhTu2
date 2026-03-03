/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author tu650
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        TextField textField = new TextField();
        textField.setPromptText("Enter name");

        Button button = new Button("Save to MySQL");

        Label label = new Label();

        button.setOnAction(e -> {
            String name = textField.getText();

            if (name.isEmpty()) {
                label.setText("Name cannot be empty!");
                return;
            }

            try {
                UserDAO.insertUser(name);
                label.setText("Saved successfully!");
                textField.clear();
            } catch (Exception ex) {
                label.setText("Database error!");
                ex.printStackTrace();
            }
        });

        VBox root = new VBox(10, textField, button, label);
        root.setStyle("-fx-padding: 20");

        stage.setTitle("JavaFX + MySQL Demo");
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
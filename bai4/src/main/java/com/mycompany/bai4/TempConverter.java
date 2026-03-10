package com.mycompany.bai4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




/**
 * JavaFX App
 */

public class TempConverter extends Application {

   @Override
    public void start(Stage stage) {
        
        Label lblInstruction = new Label("Nhập nhiệt độ (Celsius):");
        TextField txtCelsius = new TextField();
        txtCelsius.setPromptText("Ví dụ: 30");

        Button btnConvert = new Button("Chuyển sang Fahrenheit");
        Label lblResult = new Label("Kết quả: -- °F");
        
        
        lblResult.setStyle("-fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        
        btnConvert.setOnAction(e -> {
            try {
                String input = txtCelsius.getText();
                double celsius = Double.parseDouble(input);
                
                
                double fahrenheit = celsius * 9 / 5 + 32;
                
                lblResult.setText(String.format("Kết quả: %.2f °F", fahrenheit));
            } catch (NumberFormatException ex) {
                lblResult.setText("Lỗi: Vui lòng nhập số!");
            }
        });

        
        VBox root = new VBox(15); 
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(lblInstruction, txtCelsius, btnConvert, lblResult);

        
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("C sang F Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
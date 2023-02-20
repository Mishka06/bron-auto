package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class WindowController {

    @FXML
    private Button button;

    @FXML
    private TextField text;

    @FXML
    private TextField texte;

    @FXML
    private ImageView picture3;

    @FXML
    void initialize() {


        button.setOnAction(clik -> {
            button.setText("Спасибо за регистрацию ");
            System.out.println("Логин: " + text.getText());
            System.out.println("Пароль: " + texte.getText());
           button.getScene().getWindow().hide();


            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\bronauto\\src\\inputpass.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(texte.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("table.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Бронирование автомобилей ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("password success");
                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("inputerror.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Бронирование автомобилей ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\bronauto\\src\\inputlogin.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {

                    if (line.equals(text.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("table.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Бронирование автомобилей ");
                        } catch (Exception e) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("inputerror.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Бронирование автомобилей ");
                            e.printStackTrace();
                        }

                        System.out.println("login success");
                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("inputerror.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Бронирование автомобилей ");
                    }

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}

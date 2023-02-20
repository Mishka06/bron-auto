package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;

public class Registration {

    @FXML
    private TextField login;

    @FXML
    private TextField pass;

    @FXML
    private TextField nm;

    @FXML
    private Button reg;
    @FXML
    private Button pra;

    @FXML
    private Button pre;
    @FXML
    private Button num;

    @FXML
    private ImageView picture2;

    @FXML
    private ImageView pictures2;
    @FXML
    public void initialize() {
        pra.setOnAction(clik -> {
            try {
                String line=(pass.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\bronauto\\src\\inputpass.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Пароль сохранён");
            } catch (Exception e) {
                System.out.println("Пароль не удалось сохранить");
            }
        });
        pre.setOnAction(clik -> {
            try {
                String line=(login.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\bronauto\\src\\inputlogin.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Логин сохранён");
            } catch (Exception e) {
                System.out.println("Логин не удалось сохранить");
            }
        });
        num.setOnAction(clik -> {
            try {
                String line=(nm.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\bronauto\\src\\num.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Телефон сохранён");
            } catch (Exception e) {
                System.out.println("Телефон не удалось сохранить");
            }
        });
        reg.setOnAction(clik -> {
            try {


                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("file3.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Бронирование автомобилей ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}

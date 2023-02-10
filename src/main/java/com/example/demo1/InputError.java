package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InputError {

    @FXML
    private Button repeat;

    @FXML
    private ImageView picture5;

    @FXML
    void initialize(){
        repeat.setOnAction(clik->{
            repeat.getScene().getWindow().hide();
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("file3.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Бронирование автомобилей ");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
    }

}

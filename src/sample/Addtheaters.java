package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Addtheaters {
    public void addtheaters() throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("addtheaters.fxml"));
        Stage stage1 = new Stage();
        stage1.setTitle("Добавление кинотеатров");
        stage1.setScene(new Scene(root1, 824, 400));
        stage1.show();
    }
}

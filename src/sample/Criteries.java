package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Criteries {
    public void criteries() throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("criteries.fxml"));
        Stage stage1 = new Stage();
        stage1.setTitle("Настройка критериев");
        stage1.setScene(new Scene(root1, 824, 400));
        stage1.show();
    }
}

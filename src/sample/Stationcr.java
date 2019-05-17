package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Stationcr {


        public void stationcr() throws IOException {

            Parent root3 = FXMLLoader.load(getClass().getResource("stationcr.fxml"));
            Stage stage3 = new Stage();
            stage3.setTitle("Выберите станцию метро");
            stage3.setScene(new Scene(root3, 324, 114));
            stage3.show();
        }
}

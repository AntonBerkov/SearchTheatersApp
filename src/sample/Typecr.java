package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Typecr {



        public void typecr() throws IOException {

            Parent root3 = FXMLLoader.load(getClass().getResource("typecr.fxml"));
            Stage stage3 = new Stage();
            stage3.setTitle("Выберите вид кинотеатра");
            stage3.setScene(new Scene(root3, 324, 114));
            stage3.show();
        }
}

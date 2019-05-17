package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main_page {


    public void page() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Поиск кинотеатров");
        stage.setScene(new Scene(root, 778, 666));
        stage.show();

    }

}

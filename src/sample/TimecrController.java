package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class TimecrController {
    ObservableList<String> theatertimelist = FXCollections.observableArrayList("круглосуточно","не круглосуточно");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> box;

    @FXML
    private Button butt;

    @FXML
    void initialize() {
     box.setItems(theatertimelist);
     box.setValue(theatertimelist.get(0));
     butt.setOnAction(event -> {
         String m = box.getValue();
         Searchresults searchresults =new Searchresults();
         try {
             searchresults.serchrestime(m);
         } catch (IOException e) {
             e.printStackTrace();
         }
     });
    }
}

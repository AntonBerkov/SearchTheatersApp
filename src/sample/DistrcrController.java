package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class DistrcrController {
    ObservableList<String> crdistr = FXCollections.observableArrayList("Центральный","Советский","Первомайский","Партизанский","Заводской","Ленинский","Октябрьский","Московский","Фрунзенский");

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
        box.setItems(crdistr);
        box.setValue(crdistr.get(0));
        butt.setOnAction(event -> {
            String m = box.getValue();
            Searchresults searchresults1 = new Searchresults();
            try {
                searchresults1.serchresdistrict(m);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}

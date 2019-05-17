package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class TypecrController {

    ObservableList<String> theatertypelist = FXCollections.observableArrayList("обычный кинотеатр","частный кинотеатр", "автокинотеатр");
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
        box.setItems(theatertypelist);
        box.setValue(theatertypelist.get(0));
        butt.setOnAction(event -> {
            String m = box.getValue();
            Searchresults searchresults1 = new Searchresults();
            try {
                searchresults1.serchrestype(m);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}

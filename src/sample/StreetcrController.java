
package sample;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;

        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.ComboBox;

public class StreetcrController {

    ObservableList<String> crstreet = FXCollections.observableArrayList("ул. Петра Мстиславца","проспект Независимости");

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
        box.setItems(crstreet);
        box.setValue(crstreet.get(0));

        butt.setOnAction(event -> {
           String m = box.getValue();
           Searchresults sr = new Searchresults();
            try {
                sr.serchresstreet(m);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}


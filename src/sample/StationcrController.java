package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class StationcrController {

    ObservableList<String> theaterstationlist = FXCollections.observableArrayList(
            "Уручье",
            "Борисовский тракт",
            "Восток",
            "Московская",
            "Парк Челюскинцев",
            "Академия Наук",
            "Площадь Якуба Коласа",
            "Площадь Победы",
            "Октябрьская",
            "Площадь Ленина",
            "Институт Культуры",
            "Грушевка",
            "Михалово",
            "Петровщина",
            "Малиновка",
            "Каменная Горка",
            "Кунцевщина",
            "Спортивная",
            "Пушкинская",
            "Молодежная",
            "Фрунзенская",
            "Немига",
            "Купаловская",
            "Первомайская",
            "Пролетарская",
            "Тракторный завод",
            "Партизанская",
            "Автозаводская",
            "Могилевская"
    );

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
        box.setItems(theaterstationlist);
        box.setValue(theaterstationlist.get(0));
        butt.setOnAction(event -> {
            String m = box.getValue();
            Searchresults searchresults1 = new Searchresults();
            try {
                searchresults1.serchresstation(m);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}

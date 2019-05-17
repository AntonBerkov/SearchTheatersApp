package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddtheatersController {


    ObservableList<String> theatertypelist = FXCollections.observableArrayList("обычный кинотеатр","частный кинотеатр", "автокинотеатр");
    ObservableList<String> theaterstreetlist = FXCollections.observableArrayList("ул. Петра Мстиславца","проспект Независимости");
    ObservableList<String> theaterdistrictlist = FXCollections.observableArrayList("Центральный","Советский","Первомайский","Партизанский","Заводской","Ленинский","Октябрьский","Московский","Фрунзенский");
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

    ObservableList<String> theatertimelist = FXCollections.observableArrayList("круглосуточно","не круглосуточно");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> theatertype;

    @FXML
    private ComboBox<String> theaterditrict;

    @FXML
    private ComboBox<String> theaterstation;

    @FXML
    private ComboBox<String> theatertime;

    @FXML
    private CheckBox inv;

    @FXML
    private CheckBox twod;

    @FXML
    private CheckBox threed;

    @FXML
    private CheckBox sub;

    @FXML
    private CheckBox cafe;

    @FXML
    private CheckBox vip;

    @FXML
    private CheckBox wifi;

    @FXML
    private Button searchcr;

    @FXML
    private TextField theatername;

    @FXML
    private TextField theaterhouse;

    @FXML
    private TextField theaterphone;

    @FXML
    private ComboBox<String> theaterstreet;


    @FXML
    void initialize() {
        theatertype.setItems(theatertypelist);
        theatertype.setValue(theatertypelist.get(0));
        theaterstreet.setItems(theaterstreetlist);
        theaterstreet.setValue(theaterstreetlist.get(0));
        theaterditrict.setItems(theaterdistrictlist);
        theaterditrict.setValue(theaterdistrictlist.get(0));
        theaterstation.setItems(theaterstationlist);
        theaterstation.setValue(theaterstationlist.get(0));
        theatertime.setItems(theatertimelist);
        theatertime.setValue(theatertimelist.get(0));



         searchcr.setOnAction(event -> {
             String house1 = theaterhouse.getText();
             String name1 = theatername.getText();
             String phone1 = theaterphone.getText();

             String type = theatertype.getValue();
             String street = theaterstreet.getValue();
             String district = theaterditrict.getValue();
             String station = theaterstation.getValue();
             String time = theatertime.getValue();

             String s2d;
             if (twod.isSelected()){
                 s2d = "да";
             }
             else s2d = "нет";

             String s3d;
             if(threed.isSelected()){
                 s3d = "да";
             }
             else  s3d = "нет";
             String ssub;
             if(sub.isSelected()){
                 ssub = "да";

             }
             else ssub = "нет";

             String scafe;
             if(cafe.isSelected()){
                 scafe = "да";
             }
             else scafe = "нет";

             String sinv;
             if(inv.isSelected()){
                 sinv = "да";
             }
             else sinv = "нет";

             String svip;
             if (vip.isSelected()){
                 svip = "да";
             }
             else svip = "нет";

             String swifi;
             if(wifi.isSelected()){
                 swifi = "да";
             }
             else swifi = "нет";

             DatabaseHandler databaseHandler = new DatabaseHandler();
             databaseHandler.setTheater(name1,type,street,district,station,time, s2d, s3d, ssub, scafe, sinv, svip, swifi, house1, phone1);
         });
    }
}

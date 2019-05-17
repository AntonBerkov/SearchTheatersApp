package sample;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;


public class Controller {
    ObservableList<String> searchmethods = FXCollections.observableArrayList("улице","району", "названию", "станции метро", "виду кинотеатра", "времени показа",
            "кинотеатрам с 2D", "кинотеатрам с 3D", "кинотеатрам с субтитрами к фильмам", "кинотеатрам с местами для инвалидов", "кинотеатрам с кафе", "кинотеатрам с VIP залами", "кинотеатрам с WI-FI");



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane pane1;

    @FXML
    private Button addbutt;

    @FXML
    private TextField searchField;

    @FXML
    private Button searchButton;

    @FXML
    private Button okButton;

    @FXML
    private ComboBox<String> quicksearch;


    @FXML
    private TableView<Theater> table;

    @FXML
    private TableColumn<Theater, String> namecolumn;



    @FXML
    void initialize() {

        quicksearch.setItems(searchmethods);
        quicksearch.setValue(searchmethods.get(0));
        searchField.setText(null);
        searchField.setVisible(false);

        DatabaseHandler dbh = new DatabaseHandler();
        ResultSet a = dbh.getTheaters();
        String s ;

        quicksearch.setOnAction(event -> {
                if (quicksearch.getValue().equals("названию")) {
                    searchField.setVisible(true);} else searchField.setVisible(false);
        });






        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

      while (true) {
            try {
                if (!a.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = a.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                namecolumn.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                table.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

     TableView.TableViewSelectionModel<Theater> selectionModel = table.getSelectionModel();
      selectionModel.selectedItemProperty().addListener(new ChangeListener<Theater>() {
          @Override
          public void changed(ObservableValue<? extends Theater> observable, Theater oldValue, Theater newValue) {
              if(newValue != null) {
                  String g = newValue.getTheatername();



                  Info info1 = new Info();
                  try {
                      info1.info(g);
                  } catch (IOException e) {
                      e.printStackTrace();
                  }

              }
          }
      });

      addbutt.setOnAction(event -> {
          Addtheaters addtheaters1 = new Addtheaters();
          try {
              addtheaters1.addtheaters();
          } catch (IOException e) {
              e.printStackTrace();
          }
      });


     okButton.setOnAction(event -> {
         if((quicksearch.getValue().equals("названию"))&&(searchField.getText()!=null))
         {
             String search = searchField.getText();
             Searchresults searchresults1 = new Searchresults();
             try {
                 searchresults1.searchresults(search);
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }

         if(quicksearch.getValue().equals("кинотеатрам с 2D")){
             Searchresults searchresults = new Searchresults();
             try {
                 searchresults.serchres2d();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }

         if (quicksearch.getValue().equals("кинотеатрам с 3D")){
             Searchresults searchresults2 = new Searchresults();
             try {
                 searchresults2.serchres3d();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         if(quicksearch.getValue().equals("кинотеатрам с субтитрами к фильмам")){
             Searchresults searchresults = new Searchresults();
             try {
                 searchresults.serchressub();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }

         if(quicksearch.getValue().equals("кинотеатрам с местами для инвалидов")){
             Searchresults searchresults = new Searchresults();
             try {
                 searchresults.serchresinv();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         if(quicksearch.getValue().equals("кинотеатрам с кафе")){
             Searchresults searchresults = new Searchresults();
             try {
                 searchresults.serchrescafe();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         if(quicksearch.getValue().equals("кинотеатрам с VIP залами")){
             Searchresults searchresults = new Searchresults();
             try {
                 searchresults.serchresvip();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         if (quicksearch.getValue().equals("кинотеатрам с WI-FI")){
             Searchresults searchresults = new Searchresults();
             try {
                 searchresults.serchreswifi();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         if(quicksearch.getValue().equals("улице")){
             Streetcr streetcr1 = new Streetcr();
             try {
                 streetcr1.streetcr();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         if (quicksearch.getValue().equals("району"))
         {
          Distrcr distrcr1 = new Distrcr();
             try {
                 distrcr1.distrcr();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }

         if (quicksearch.getValue().equals("станции метро"))
         {
           Stationcr stationcr1 = new Stationcr();
             try {
                 stationcr1.stationcr();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         if(quicksearch.getValue().equals("виду кинотеатра"))
         {
          Typecr typecr1 = new Typecr();
             try {
                 typecr1.typecr();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         if(quicksearch.getValue().equals("времени показа"))
         {
          Timecr timecr1 = new Timecr();
             try {
                 timecr1.timecr();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

     });


     searchButton.setOnAction(event -> {
         Criteries criteries1 = new Criteries();
         try {
             criteries1.criteries();
         } catch (IOException e) {
             e.printStackTrace();
         }
     });
    }



}

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SearchresultsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Theater> searchtheatertable;

    @FXML
    private TableColumn<Theater, String> searchtheatername;

    @FXML
    void initialize() {


    }

    public void searchbyText(String m){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet rs = databaseHandler.getByText(m);



        String s ;


        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = rs.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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


    }

    public void searchbyCriteries(String sstreet, String sdistr, String sstation, String stype, String stime, String s2d, String s3d, String ssub, String scafe, String sinv, String svip, String swifi){
        DatabaseHandler handler = new DatabaseHandler();
        ResultSet resultSet = handler.getByCriteries(sstreet, sdistr, sstation, stype, stime, s2d, s3d, ssub, scafe, sinv, svip, swifi);
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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
    }

    public void search2d(){
        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serch2d();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void search3d(){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serch3d();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchsub(){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchsub();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchinv(){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchinv();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchcafe(){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchcafe();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchvip(){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchvip();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchwifi(){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchwifi();
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }


    public void searchstreet(String m){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchstreet(m);
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchdistr(String m){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchdistr(m);
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchstation(String m){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchstation(m);
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }

    public void searchtype(String m){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchtype(m);
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }
    public void searchtime(String m){

        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet resultSet= databaseHandler.serchtime(m);
        String s ;
        ObservableList<Theater> theaterObservableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                s = resultSet.getString("THEATER_NAME");

                theaterObservableList.add(new Theater(s));
                searchtheatername.setCellValueFactory(new PropertyValueFactory<Theater, String>("theatername"));
                searchtheatertable.setItems(theaterObservableList);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        TableView.TableViewSelectionModel<Theater> selectionModel = searchtheatertable.getSelectionModel();
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

    }
}

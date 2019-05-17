package sample;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class InfoController {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public Text nameoftheater;

    @FXML
    private Text adressoftheater;

    @FXML
    private Text distroftheater;

    @FXML
    private Text stationoftheater;

    @FXML
    private Text phoneoftheater;

    @FXML
    private Text typeoftheater;

    @FXML
    private Text timeoftheater;

    @FXML
    private Text theatersps;

    @FXML
    private Text showsps;



    @FXML
    void initialize() {


    }



    public void setInfo(String m) {

        DatabaseHandler dbh1 = new DatabaseHandler();
        ResultSet a1 = dbh1.getTheatername(m);

        while (true) {
            try {
                if (!a1.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

              String  c1 = a1.getString("THEATER_NAME");


                nameoftheater.setText(c1);



            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ResultSet a2 = dbh1.getTheateradress(m);


        while (true) {
            try {
                if (!a2.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c2 = a2.getString("THEATER_ADRESS");

                adressoftheater.setText(c2);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ResultSet a3 = dbh1.getTheaterdistrict(m);
        while (true) {
            try {
                if (!a3.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c3 = a3.getString("THEATER_DISTRICT");

                distroftheater.setText(c3);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ResultSet a4 = dbh1.getTheaterstation(m);
        while (true) {
            try {
                if (!a4.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c4 = a4.getString("THEATER_STATION");

                stationoftheater.setText(c4);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ResultSet a5 = dbh1.getTheaterphone(m);
        while (true) {
            try {
                if (!a5.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c5 = a5.getString("THEATER_PHONE");

                phoneoftheater.setText(c5);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ResultSet a7 = dbh1.getTheatertime(m);
        while (true) {
            try {
                if (!a7.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c7 = a7.getString("THEATER_TIME");

               timeoftheater.setText(c7);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



        ResultSet a10 = dbh1.getTheatertype(m);
        while (true) {
            try {
                if (!a10.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c8 = a10.getString("THEATER_TYPE");

                typeoftheater.setText(c8);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }





        ResultSet a8 = dbh1.getTheatershow(m);
        while (true) {
            try {
                if (!a8.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c8 = a8.getString("THEATER_2D");
                String c9 = a8.getString("THEATER_3D");
                String c10 = a8.getString("THEATER_SUB");
                String res =null;
                if(c8.equals("да"))
                {
                    res="2D" + "\n";
                }
                if(c9.equals("да")){
                    res+="3D" + "\n";
                }
                if(c10.equals("да")){
                    res+="Кино с субтитрами";
                }

                showsps.setText(res);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        ResultSet a9 = dbh1.getTheaterspecies(m);
        while (true) {
            try {
                if (!a9.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {

                String c8 = a9.getString("THEATER_CAFE");
                String c9 = a9.getString("THEATER_INV");
                String c10 = a9.getString("THEATER_VIP");
                String c11 = a9.getString("THEATER_WIFI");
                String res = null;
                if(c8.equals("да"))
                {
                    res="Кафе" + "\n";
                }
                if(c9.equals("да")){
                    res+="Места для инвалидов" + "\n";
                }
                if(c10.equals("да")){
                    res+="VIP места";
                }
                if(c11.equals("да")){
                    res+="WI-FI";
                }

                theatersps.setText(res);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


}

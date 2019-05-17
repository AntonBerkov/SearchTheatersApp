package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Searchresults {



    public void searchresults(String search) throws IOException {
        String m =search;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
      //  InfoController controller = loader.getController();
     //   controller.setInfo(m);
        SearchresultsController controller =loader.getController();
        controller.searchbyText(m);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void searchresult1(String sstreet, String sdistr, String sstation, String stype, String stime, String s2d, String s3d, String ssub, String scafe, String sinv, String svip, String swifi) throws IOException{
      //  String m =search;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchbyCriteries(sstreet,sdistr,sstation,stype,stime,s2d,s3d,ssub,scafe,sinv,svip,swifi);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchres2d()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.search2d();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchres3d()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.search3d();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchressub()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchsub();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchresinv()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchinv();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }
    public void serchrescafe()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchcafe();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }
    public void serchresvip()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchvip();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }
    public void serchreswifi()throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchwifi();

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchresstreet(String m)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchstreet(m);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchresdistrict(String m)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchdistr(m);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchresstation(String m)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchstation(m);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchrestype(String m)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchtype(m);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

    public void serchrestime(String m)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchresults.fxml"));
        Parent root3 = loader.load();
        SearchresultsController controller =loader.getController();
        controller.searchtime(m);

        Stage stage2 = new Stage();
        stage2.setTitle("Результаты поиска");
        stage2.setScene(new Scene(root3, 600, 400));
        stage2.show();
    }

}

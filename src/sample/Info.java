package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Info {


    public void info(String g) throws IOException {
        String m =g;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("info.fxml"));
        Parent root2 = loader.load();
        InfoController controller = loader.getController();
        controller.setInfo(m);
        Stage stage2 = new Stage();
        stage2.setTitle("Информация о кинотеатре");
        stage2.setScene(new Scene(root2, 600, 632));
        stage2.show();
    }
}



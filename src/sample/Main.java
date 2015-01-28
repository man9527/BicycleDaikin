package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        VBox meterContainer = (VBox) root.lookup("#meter_container");
        //meterContainer.getStyleClass().removeAll();
        //meterContainer.getStyleClass().add("p4");

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

import static javafx.application.Application.launch;

public class Main extends Application {
    public static void main(String[] args) { launch();}


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/addItem.fxml"))));
        primaryStage.show();

        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("View/viewItem.fxml"))));
        stage.show();
    }
}
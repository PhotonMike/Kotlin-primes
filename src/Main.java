import javafx.application.Application;
import javafx.stage.Stage;

/*
* This class is just a launcher for
* the Primestuffs class.
*/

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Primestuffs.Companion.Main();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
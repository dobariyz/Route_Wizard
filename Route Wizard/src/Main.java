import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        BorderPane root = loader.load();

        // Create instances of the other classes
        Schedule schedule = new Schedule();
        BusRoute busRoute = new BusRoute();
        BusStop busStop = new BusStop();

        // Set the controller for the FXML file
        RouteBuilder controller = loader.getController();
        controller.setSchedule(schedule);
        controller.setBusRoute(busRoute);
        controller.setBusStop(busStop);

        // Create the scene and show the stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
}

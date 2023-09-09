

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ComboBox<String> busNumComboBox;

    @FXML
    private Button addBusStopButton;

    @FXML
    private TextField busStopTextField;

    @FXML
    private TextArea routeTextArea;

    @FXML
    private ListView<String> busStopsListView;

    @FXML
    private Label statusLabel;

    private RouteBuilder routeBuilder;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        routeBuilder = new RouteBuilder(null, null);

        // populate the busNumComboBox with the available bus numbers
        ArrayList<String> busNumbers = routeBuilder.getBusNumbers();
        busNumComboBox.getItems().addAll(busNumbers);
    }

    @FXML
    void onAddBusStopClicked(MouseEvent event) {
        String busStop = busStopTextField.getText().trim();
        if (!busStop.isEmpty()) {
            routeBuilder.addStop(busStop);
            busStopsListView.getItems().add(busStop);
            busStopTextField.clear();
        }
    }

    @FXML
    void onBusNumSelected(MouseEvent event) {
        String busNum = busNumComboBox.getValue();
        if (busNum != null) {
            String route = routeBuilder.getRoute(busNum);
            routeTextArea.setText(route);
            busStopsListView.getItems().clear();
            busStopsListView.getItems().addAll(routeBuilder.getBusStops(busNum));
            statusLabel.setText("");
        }
    }

    @FXML
    void onSaveRouteClicked(MouseEvent event) {
        String busNum = busNumComboBox.getValue();
        if (busNum != null) {
            boolean saved = routeBuilder.saveRoute(busNum);
            if (saved) {
                statusLabel.setText("Route saved successfully");
            } else {
                statusLabel.setText("Failed to save route");
            }
        }
    }

}

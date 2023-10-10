package sio.tpbidonb;

import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TpBidonAController implements Initializable {

    @javafx.fxml.FXML
    private Button btnPSG;
    @javafx.fxml.FXML
    private Button btnDortmund;
    @javafx.fxml.FXML
    private AnchorPane apPSG;
    @javafx.fxml.FXML
    private AnchorPane apDortmund;

    @javafx.fxml.FXML
    public void btnPSGClicked(Event event) {
        apPSG.toFront();
    }

    @javafx.fxml.FXML
    public void btnDortmundClicked(Event event) {
        apDortmund.toFront();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
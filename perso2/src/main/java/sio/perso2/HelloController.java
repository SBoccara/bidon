import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button myButton;

    @FXML
    public void initialize() {
        myButton.setOnAction(event -> myButton.setStyle("-fx-background-color: #ff0000;"));
    }
}

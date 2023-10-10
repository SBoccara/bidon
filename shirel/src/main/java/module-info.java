module shirelprojet.shirel {
    requires javafx.controls;
    requires javafx.fxml;


    opens shirelprojet.shirel to javafx.fxml;
    exports shirelprojet.shirel;
}
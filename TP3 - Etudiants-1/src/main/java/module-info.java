module com.example.tp3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tp3 to javafx.fxml;
    exports sio.tp3;
}
module sio.tp1devoir.tp1devoir2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tp1devoir.tp1devoir2 to javafx.fxml;
    exports sio.tp1devoir.tp1devoir2;
}
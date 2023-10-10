module sio.perso1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.perso1 to javafx.fxml;
    exports sio.perso1;
}
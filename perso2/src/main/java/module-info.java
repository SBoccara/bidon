module sio.perso2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.perso2 to javafx.fxml;
    exports sio.perso2;
}
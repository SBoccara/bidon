module sio.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.demo to javafx.fxml;
    exports sio.demo;
}
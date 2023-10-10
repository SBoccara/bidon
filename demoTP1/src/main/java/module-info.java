module sio.demotp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.demotp1 to javafx.fxml;
    exports sio.demotp1;
}
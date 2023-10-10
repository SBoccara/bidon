module sio.tpbidonb {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tpbidonb to javafx.fxml;
    exports sio.tpbidonb;
}
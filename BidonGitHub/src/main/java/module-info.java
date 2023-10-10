module sio.bidongithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.bidongithub to javafx.fxml;
    exports sio.bidongithub;
}
module com.example.transport {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.transport to javafx.fxml;
    exports com.example.transport;
}
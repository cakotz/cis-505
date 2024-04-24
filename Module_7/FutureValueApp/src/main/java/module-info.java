module com.example.futurevalueapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.futurevalueapp to javafx.fxml;
    exports com.example.futurevalueapp;
}
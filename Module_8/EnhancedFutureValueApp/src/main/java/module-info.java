module com.example.enhancedfuturevalueapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.enhancedfuturevalueapp to javafx.fxml;
    exports com.example.enhancedfuturevalueapp;
}
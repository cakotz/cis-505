module com.example.gradebookapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gradebookapp to javafx.fxml;
    exports com.example.gradebookapp;
}
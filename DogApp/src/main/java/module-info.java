module com.example.dogapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.dogapp to javafx.fxml;
    exports com.example.dogapp;
}
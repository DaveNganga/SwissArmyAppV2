module com.example.swissarmy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires jdk.javadoc;

    opens com.example.swissarmy to javafx.fxml;
    exports com.example.swissarmy;
}
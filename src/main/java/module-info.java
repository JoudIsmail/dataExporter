module dataExporter {
    requires transitive java.desktop;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.dataExporter;
    opens com.dataExporter.controller;
}
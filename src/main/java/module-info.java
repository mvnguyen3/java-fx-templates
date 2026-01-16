module org.example.template {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.template to javafx.fxml;
    exports org.example.template;
    exports org.example.template.controllers;
    opens org.example.template.controllers to javafx.fxml;
}
module com.example.testgradle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testgradle to javafx.fxml;
    exports com.example.testgradle;
}
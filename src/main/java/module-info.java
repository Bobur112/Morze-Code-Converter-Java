module com.example.morseconvertor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morseconvertor to javafx.fxml;
    exports com.example.morseconvertor;
}
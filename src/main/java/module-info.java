module com.example.week10lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week10lab to javafx.fxml;
    exports com.example.week10lab;
}
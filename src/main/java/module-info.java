module com.example.linguakid01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.linguakid01 to javafx.fxml;
    exports com.example.linguakid01;
}
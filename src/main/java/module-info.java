module com.example.studentmanagerl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagerl to javafx.fxml;
    exports com.example.studentmanagerl;
}
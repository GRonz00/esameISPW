module com.example.progetto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.progetto to javafx.fxml;
    exports com.progetto;
}
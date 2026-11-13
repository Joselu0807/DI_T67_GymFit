module com.example.di_t67_gymfit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.di_t67_gymfit to javafx.fxml;
    exports com.example.di_t67_gymfit;
}
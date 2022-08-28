module com.raul.filechooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.raul.filechooser to javafx.fxml;
    exports com.raul.filechooser;
}
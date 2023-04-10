module com.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.demo1 to javafx.fxml;
    exports com.demo1;
}

module com.example.pfachat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.pfachat to javafx.fxml;
    exports com.example.pfachat;
}
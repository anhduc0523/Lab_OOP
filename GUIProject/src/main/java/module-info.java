module com.example.guiprojectt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.testng;


    opens com.example.guiprojectt to javafx.fxml;
    //exports com.example.guiprojectt;
}
module ku.cs.smdtouml {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.smdtouml to javafx.fxml;
    exports ku.cs.smdtouml;
}
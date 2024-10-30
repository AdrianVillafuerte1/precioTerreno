module com.uiejemplos.preciodeterreno {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.uiejemplos.preciodeterreno.tests to javafx.fxml;
    exports com.uiejemplos.preciodeterreno.tests;


}
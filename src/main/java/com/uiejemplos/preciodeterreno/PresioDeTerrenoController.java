package com.uiejemplos.preciodeterreno;

import com.uiejemplos.preciodeterreno.modelos.Terreno;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class PresioDeTerrenoController {
    public TextField txtFldAncho;
    public TextField txtFldPrecioPorMetro;
    public TextField txtFldLargo;
    public TextField txtFldPrecio;
    public Button btnCalcular;
    public Button btnSalir;

    public void onActionBtnSalir(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        Stage stg = (Stage) node.getScene().getWindow();
        stg.close();
    }

    public void onActionBtnCalcular(ActionEvent actionEvent) {
        double ancho;
        double largo;
        double precioPorM;
        try {
            ancho = Double.parseDouble(txtFldAncho.getText());
            largo = Double.parseDouble(txtFldLargo.getText());
            precioPorM = Double.parseDouble(txtFldPrecioPorMetro.getText());
            Terreno t = new Terreno(ancho, largo, precioPorM);
            txtFldPrecio.setText(String.valueOf(t.calcularPrecio()));
        } catch (NumberFormatException exc) {
            Alert alert = new Alert(Alert.AlertType.ERROR,"Error el valor Numerico", ButtonType.OK);
            alert.setTitle("Error");
            alert.setHeaderText("");
            alert.showAndWait();


        }

    }

}


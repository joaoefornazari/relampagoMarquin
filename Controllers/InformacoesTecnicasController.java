/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruno
 */
public class InformacoesTecnicasController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblInfo;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnProx;
    @FXML
    private GridPane gpCenter;
    @FXML
    private Label lblAno;
    @FXML
    private TextField txtAno;
    @FXML
    private Label lblPreco;
    @FXML
    private Label lblComb;
    @FXML
    private TextField txtComb;
    @FXML
    private Label lblIpva;
    @FXML
    private TextField txtIpva;
    @FXML
    private Label lblConf;
    @FXML
    private TextField txtConf;
    @FXML
    private Label lblPorte;
    @FXML
    private TextField txtPorte;
    @FXML
    private TextField txtPreco;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mudarCenaVoltar(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/PrecoPeriodosFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaProx(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/ImagemVeiculoFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnProx.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

}

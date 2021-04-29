/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
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
public class CadastrarCondutorController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblDadosCond;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnCad;
    @FXML
    private GridPane gpCenter;
    @FXML
    private HBox hbCnh;
    @FXML
    private Label lblCnh;
    @FXML
    private TextField txtCnh;
    @FXML
    private Label lblDataVenc;
    @FXML
    private DatePicker dtpDataVenc;
    @FXML
    private Label lblTelR;
    @FXML
    private TextField txtTelR;
    @FXML
    private Label lblEmail;
    @FXML
    private TextField txtEmail;
    @FXML
    private Label lblCat;
    @FXML
    private GridPane gpCat;
    @FXML
    private Label lblTelC;
    @FXML
    private TextField txtTelC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mudarCenaCadCli(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/CadastrarClienteFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void MudarCenaCad(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/projetoMainFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnCad.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

}

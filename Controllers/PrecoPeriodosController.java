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
public class PrecoPeriodosController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblPrecoLoc;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnProx;
    @FXML
    private GridPane gpCenter;
    @FXML
    private TextField txtSemanal;
    @FXML
    private TextField txtDiaria;
    @FXML
    private TextField txtQuinzenal;
    @FXML
    private Label lblHora;
    @FXML
    private Label lblHoraExc;
    @FXML
    private Label lblMensal;
    @FXML
    private Label lblDiaria;
    @FXML
    private Label lblSemanal;
    @FXML
    private Label lblQuinzenal;
    @FXML
    private TextField txtMensal;
    @FXML
    private TextField txtHora;
    @FXML
    private TextField txtHoraExc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mudarCenaVoltar(ActionEvent event) throws IOException {
        BorderPane newRoot = FXMLLoader.load(getClass().getResource("../telasFX/ManutencaoVeiculoFXML.fxml"));
        Scene scene = new Scene(newRoot);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaProx(ActionEvent event) throws IOException {
        BorderPane newRoot = FXMLLoader.load(getClass().getResource("../telasFX/InformacoesTecnicasFXML.fxml"));
        Scene scene = new Scene(newRoot);
        Stage stage = (Stage) btnProx.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

}

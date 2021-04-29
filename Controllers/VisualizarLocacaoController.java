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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruno
 */
public class VisualizarLocacaoController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblLocEscolhida;
    @FXML
    private VBox vbLeft;
    @FXML
    private HBox hbCodLoc;
    @FXML
    private Label lblCodLoc;
    @FXML
    private Label lblCodLocDados;
    @FXML
    private HBox hbRenavan;
    @FXML
    private Label lblRenavan;
    @FXML
    private Label lblRenavanDados;
    @FXML
    private HBox hbPlaca;
    @FXML
    private Label lblPlaca;
    @FXML
    private Label lblPlacaDados;
    @FXML
    private HBox hbMarca;
    @FXML
    private Label lblMarca;
    @FXML
    private Label lblMarcaDados;
    @FXML
    private HBox hbKm;
    @FXML
    private Label lblKm;
    @FXML
    private Label lblKmDados;
    @FXML
    private HBox hbTipoLoc;
    @FXML
    private Label lblTipoLoc;
    @FXML
    private Label lblTipoLocDados;
    @FXML
    private HBox hbQtdDiarias;
    @FXML
    private Label lblQtdDiarias;
    @FXML
    private Label lblQtdDiariasDados;
    @FXML
    private HBox hbDesc;
    @FXML
    private Label lblDesc;
    @FXML
    private HBox hbDescTxt;
    @FXML
    private TextArea txtDesc;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnProx;
    @FXML
    private VBox vbRight;
    @FXML
    private HBox hbNada;
    @FXML
    private HBox hbModelo;
    @FXML
    private Label lblModelo;
    @FXML
    private Label lblModeloDados;
    @FXML
    private HBox hbAno;
    @FXML
    private Label lblAno;
    @FXML
    private Label lblAnoDados;
    @FXML
    private HBox hbDataLoc;
    @FXML
    private Label lblDataLoc;
    @FXML
    private Label lblDataLocDados;
    @FXML
    private HBox hbDataDev;
    @FXML
    private Label lblDataDev;
    @FXML
    private Label lblDataDevDados;
    @FXML
    private HBox hbValorUnit;
    @FXML
    private Label lblValorUnit;
    @FXML
    private Label lblValorUnitDados;
    @FXML
    private HBox hbValorSeg;
    @FXML
    private Label lblValorSeg;
    @FXML
    private Label lblValorSegDados;
    @FXML
    private HBox hbValorTot;
    @FXML
    private Label lblValorTot;
    @FXML
    private Label lblValorTotDados;
    @FXML
    private HBox hbSeguroExt;
    @FXML
    private Label lblSeguroExt;
    @FXML
    private HBox hbSeguroExtTxt;
    @FXML
    private TextField txtSeguroExt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mudarCenaVoltar(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/LocacaoSelecionarVeiculoFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaProx(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/projetoMainFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnProx.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

}

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
import javafx.scene.control.ListView;
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
public class LocacaoSelecionarVeiculoController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblSelVc;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnProx;
    @FXML
    private VBox vbCenter;
    @FXML
    private Label lblListaVc;
    @FXML
    private HBox hbPesq;
    @FXML
    private TextField txtPesqRenavan;
    @FXML
    private TextField txtPesqPlaca;
    @FXML
    private ListView<?> listVc;
    @FXML
    private HBox hbCenter;
    @FXML
    private Button btnCadNovoVc;
    @FXML
    private Button btnEditarVc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mudarCenaVoltar(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/LocacaoSelecionarCondutorFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaProx(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/VisualizarLocacaoFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnProx.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void cadastrarNovoVc(ActionEvent event) {
    }

    @FXML
    private void editarVc(ActionEvent event) {
    }

}

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruno
 */
public class LocacaoSelecionarClienteController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblSelCli;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnProx;
    @FXML
    private VBox vbCenter;
    @FXML
    private Label lblListaCli;
    @FXML
    private ListView<String> listCli;
    @FXML
    private HBox hbCenter;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnEditar;
    @FXML
    private HBox hbTipoLoc;
    @FXML
    private Label lblTipoLoc;
    @FXML
    private GridPane gpTipoLoc;
    @FXML
    private RadioButton rbtnDiaria;
    @FXML
    private RadioButton rbtnSemanal;
    @FXML
    private RadioButton rbtnQuinzenal;
    @FXML
    private RadioButton rbtnMensal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final ToggleGroup tipoLoc = new ToggleGroup();
        rbtnDiaria.setToggleGroup(tipoLoc);
        rbtnDiaria.setSelected(true);
        rbtnMensal.setToggleGroup(tipoLoc);
        rbtnQuinzenal.setToggleGroup(tipoLoc);
        rbtnSemanal.setToggleGroup(tipoLoc);
    }

    @FXML
    private void cadastrarNovoCliente(ActionEvent event) {

    }

    @FXML
    private void editarCliente(ActionEvent event) {
    }

    @FXML
    private void mudarCenaVoltar(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/projetoMainFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaProx(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/LocacaoSelecionarCondutorFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

}

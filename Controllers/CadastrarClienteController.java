/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoFinal.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruno
 */
public class CadastrarClienteController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private HBox hbTop;
    @FXML
    private Label lblDadosCli;
    @FXML
    private HBox hbBottom;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnProx;
    @FXML
    private GridPane gpCenter;
    @FXML
    private HBox hbTipoCli;
    @FXML
    private RadioButton rbtnFis;
    @FXML
    private RadioButton rbtnJur;
    @FXML
    private Label lblTipoCli;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblStatus;
    @FXML
    private Label lblBloq;
    @FXML
    private TextField txtNome;
    @FXML
    private ComboBox<?> cboxStatus;
    @FXML
    private ComboBox<?> cboxBloq;
    @FXML
    private Label lblDataN;
    @FXML
    private DatePicker dtpDataN;
    @FXML
    private Label lblCpfCnpj;
    @FXML
    private TextField txtCpfCnpj;
    @FXML
    private Label lblRG;
    @FXML
    private TextField txtRG;
    @FXML
    private Label lblInscEst;
    @FXML
    private TextField txtInscEst;
    @FXML
    private Label lblEndereco;
    @FXML
    private TextField txtEndereco;
    @FXML
    private Label lblObs;
    @FXML
    private TextField txtObs;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final ToggleGroup tipoCliente = new ToggleGroup();
        rbtnFis.setToggleGroup(tipoCliente);
        rbtnFis.setSelected(true);
        rbtnJur.setToggleGroup(tipoCliente);

    }

    @FXML
    private void mudarCenaTelaInicial(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/projetoMainFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaCadCond(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/CadastrarCondutorFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

}

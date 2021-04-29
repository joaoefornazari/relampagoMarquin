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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fornazari
 */
public class projetoMainController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private VBox vbCenter;
    @FXML
    private Button btnRelat;
    @FXML
    private Button btnCadVc;
    @FXML
    private Button btnCadCli;
    @FXML
    private Button btnCadLoc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void mudarCenaCadVc(ActionEvent event) throws IOException {

        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/CadastrarVeiculoFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnCadVc.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaCadCli(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/CadastrarClienteFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnCadVc.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaCadLoc(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/LocacaoSelecionarClienteFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnCadLoc.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    @FXML
    private void mudarCenaRelat(ActionEvent event) {
    }

}

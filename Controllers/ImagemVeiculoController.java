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
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruno
 */
public class ImagemVeiculoController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private BorderPane bpTop;
    @FXML
    private HBox hbImagemVc;
    @FXML
    private Label lblImagemVc;
    @FXML
    private HBox hbEscolherImg;
    @FXML
    private Label lblEscolherImg;
    @FXML
    private Button btnProcurar;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnConcluir;
    @FXML
    private ImageView imgVCenter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void procurarImagem(ActionEvent event) {
    }

    @FXML
    private void mudarCenaVoltar(ActionEvent event) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("../telasFX/InformacoesTecnicasFXML.fxml"));
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
        Stage stage = (Stage) btnConcluir.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Locação de Veículos");
        stage.show();
    }

    
}

package ifpr.pgua.eic.estacionamento.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.estacionamento.App;
import ifpr.pgua.eic.estacionamento.models.Estacionamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class JanelaCadastro implements Initializable{
    
    @FXML
    private TextField tfPlaca;

    @FXML
    private TextField tfModelo;

    @FXML
    private ComboBox<String> cbFabricante;

    @FXML
    private TextField tfCor;

    private Estacionamento estacionamento;

    public JanelaCadastro(Estacionamento estacionamento){
        this.estacionamento = estacionamento;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        cbFabricante.getItems().addAll("Volskwagem","Fiat","Kia","Toyota");
        
    }

    @FXML
    private void cadastrar(ActionEvent evento){
        String placa = tfPlaca.getText();
        String modelo = tfModelo.getText();
        String cor = tfCor.getText();
        String fabricante = cbFabricante.getValue();

        boolean ret = estacionamento.cadastraVeiculo(placa, modelo, fabricante, cor);

        String msg = "";
        if(ret){
            msg = "Cadastro realizado com sucesso!";
            limpar();
        }else{
            msg = "Erro no cadastro!";
        }

        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();


    }

    @FXML
    private void limpar(){
        tfPlaca.clear();
        tfModelo.clear();
        cbFabricante.getSelectionModel().clearSelection();
        tfCor.clear();
    }

    @FXML
    private void voltar(ActionEvent evento){
        App.popScreen();
    }




}

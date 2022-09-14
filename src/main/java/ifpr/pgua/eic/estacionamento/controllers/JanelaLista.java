package ifpr.pgua.eic.estacionamento.controllers;


import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.estacionamento.App;
import ifpr.pgua.eic.estacionamento.models.Estacionamento;
import ifpr.pgua.eic.estacionamento.models.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class JanelaLista implements Initializable{

    @FXML
    private ListView<Veiculo> ltwVeiculos;

    @FXML
    private TextArea taDetalhes;

    private Estacionamento estacionamento;

    public JanelaLista(Estacionamento estacionamento){
        this.estacionamento = estacionamento;

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ltwVeiculos.getItems().addAll(estacionamento.listaTodosVeiculos());
        
    }

    @FXML
    private void mostrarDetalhes(MouseEvent evt){
        Veiculo veiculo = ltwVeiculos.getSelectionModel().getSelectedItem();

        if(veiculo != null){
            taDetalhes.clear();

            taDetalhes.appendText("Placa: "+veiculo.getPlaca()+"\n");
            taDetalhes.appendText("Modelo: "+veiculo.getModelo()+"\n");
            taDetalhes.appendText("Fabricante: "+veiculo.getFabricante()+"\n");
            taDetalhes.appendText("Cor:"+veiculo.getCor()+"\n");
        }
    }

    @FXML
    private void voltar(ActionEvent evento) {
        App.popScreen();
    }



}

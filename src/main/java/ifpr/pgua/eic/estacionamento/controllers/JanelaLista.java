package ifpr.pgua.eic.estacionamento.controllers;


import ifpr.pgua.eic.estacionamento.App;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

public class JanelaLista {

    
    public JanelaLista(){
        inicializaComponentes();
        carregaDados();
    }

    private void inicializaComponentes(){
        
    }

    private void carregaDados(){
    }

    

    public Parent getRoot(){
        return null;
    }

    private void voltar(ActionEvent evento) {
        App.popScreen();
    }

}

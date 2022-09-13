package ifpr.pgua.eic.estacionamento;

import ifpr.pgua.eic.estacionamento.controllers.JanelaPrincipal;
import ifpr.pgua.eic.estacionamento.models.Estacionamento;
import ifpr.pgua.eic.estacionamento.utils.BaseAppNavigator;
import ifpr.pgua.eic.estacionamento.utils.ScreenRegistryNoFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private Estacionamento estacionamento;

    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        return "Estacionamento";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryNoFXML(o->new JanelaPrincipal().getRoot()));
        
    }
}
package ifpr.pgua.eic.estacionamento;

import ifpr.pgua.eic.estacionamento.controllers.JanelaCadastro;
import ifpr.pgua.eic.estacionamento.controllers.JanelaLista;
import ifpr.pgua.eic.estacionamento.controllers.JanelaPrincipal;
import ifpr.pgua.eic.estacionamento.models.Estacionamento;
import ifpr.pgua.eic.estacionamento.utils.BaseAppNavigator;
import ifpr.pgua.eic.estacionamento.utils.ScreenRegistryFXML;
import ifpr.pgua.eic.estacionamento.utils.ScreenRegistryNoFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private Estacionamento estacionamento;

    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();

        estacionamento = new Estacionamento("Esta", "1122");
    }

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
        registraTela("CADASTRO",new ScreenRegistryFXML(App.class, "cadastro.fxml", o->new JanelaCadastro(estacionamento)));
        registraTela("LISTA",new ScreenRegistryFXML(App.class, "lista.fxml", o->new JanelaLista(estacionamento)));
    }
}
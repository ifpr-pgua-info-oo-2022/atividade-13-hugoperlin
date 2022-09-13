package ifpr.pgua.eic.estacionamento.models;

import java.time.LocalDateTime;

public class Veiculo {
    private String placa;
    private String modelo;
    private String fabricante;
    private String cor;
    private LocalDateTime horaEntrada;
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }


    private boolean estaEstacionado;


    public boolean isEstaEstacionado() {
        return estaEstacionado;
    }


    public Veiculo(String placa, String modelo, String fabricante, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.horaEntrada = null;
        this.estaEstacionado = false;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getFabricante() {
        return fabricante;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    

    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean registraEntrada(LocalDateTime data){
        if(!estaEstacionado){
            this.horaEntrada = data;
            this.estaEstacionado = true;

            return true;
        }
        return false;
    }

    public boolean registraSaida(){
        if(estaEstacionado){
            this.estaEstacionado = false;
            this.horaEntrada = null;
    
            return true;
        }
        return false;
    }

    public String toString(){
        return modelo+"("+placa+")";
    }
    
}

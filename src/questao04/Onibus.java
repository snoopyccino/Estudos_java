package questao04;

public class Ônibus {

    private String placa;
    private int capacidade;
    private String modelo;

    public Onibus() {}

    public Onibus(String placa, int capacidade, String modelo) {
        this.placa = placa;
        setCapacidade(capacidade);
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCapacidade(int capacidade) {
        if(capacidade >= 10) {
            this.capacidade = capacidade;
        } else {
            this.capacidade = 0;
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String toString() {
        return "Placa: " + placa + " - Capacidade: " + capacidade + " - Modelo: " + modelo;
    }

}
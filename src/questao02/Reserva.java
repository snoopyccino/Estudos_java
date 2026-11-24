package questao02;

public class Reserva {

    private String dataEntrada;
    private String dataSaida;
    private String status;

    public Reserva() {}

    public Reserva(String dataEntrada, String dataSaida, String status) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataEntrada() {
        return this.dataEntrada;
    }

    public String getDataSaida() {
        return this.dataSaida;
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        return "Entrada: " + dataEntrada + " - Saida: " + dataSaida + " - Status: " + status;
    }

}
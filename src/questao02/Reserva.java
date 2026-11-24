package questao02;

public class Reserva {
	private String DataEntrada;
	private String DataSaida;
	private String Status;
		
	public void setDataEntrada(String nome) {
		this.DataEntrada = nome;
	}
	public void setStatus(String Numero) {
		this.Status = Numero;
	}
	public void setDataSaida (String DataSaida) {
		this.DataSaida = DataSaida;
	}

	
	public String getCarga () {
		return this.DataSaida;
	}
	public String getStatus() {
		return this.Status;
	}
	public String getDataEntrada () {
		return this.DataEntrada;
	}		
	public String toString() {
		return " Data entrada: " + DataEntrada + " -  Data saida: " + DataSaida + " - Status: " + Status;
	}
}


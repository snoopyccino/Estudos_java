package questao04;

public class Onibus {

	private String Placa;
	private String Modelo;
	private int Capacidade;
		
	public void setPlaca(String placa) {
		this.Placa = placa;
	}
	public void setCapacidade(int capa) {
		this.Capacidade = capa;
	}
	public void setModelo (String modelo) {
		this.Modelo = modelo;
	}

	
	public String getModelo () {
		return this.Modelo;
	}
	public int getCapacidade() {
		return this.Capacidade;
	}
	public String getPlaca () {
		return this.Placa;
	}	
	public String toString() {
		return " Placa: " + Placa + " -  Modelo: " + Modelo + " - Capacidade: " + Capacidade;
	}
}
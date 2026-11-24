package questao05;

public class Palestra {


	private String Tema;
	private int Duracao;
	private int Sala;
		
	public void setTema(String nome) {
		this.Tema = nome;
	}
	public void setSala(int Numero) {
		this.Sala = Numero;
	}
	public void setDuracao (int Documento) {
		this.Duracao = Documento;
	}

	
	public int getDuracao () {
		return this.Duracao;
	}
	public int getSala() {
		return this.Sala;
	}
	public String getTema () {
		return this.Tema;
	}	
	public String toString() {
		return " Tema: " + Tema + " -  Duracao: " + Duracao + " - Sala: " + Sala;
	}
}
package questao10;

public class Projeto {
	private String Nome;
	private String prazo;
	private String Status;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setStatus(String Numero) {
		this.Status = Numero;
	}
	public void setPrazo (String Documento) {
		this.prazo = Documento;
	}

	
	public String getPrazo () {
		return this.prazo;
	}
	public String getStatus() {
		return this.Status;
	}
	public String getNome () {
		return this.Nome;
	}	
}
package questao03;

public class Professor {
	private String nome;
	private String CargaHoraria;
	private String formacao;
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFormacao(String Numero) {
		this.formacao = Numero;
	}
	public void setCarga (String CargaHoraria) {
		this.CargaHoraria = CargaHoraria;
	}

	
	public String getCarga () {
		return this.CargaHoraria;
	}
	public String getFormacao() {
		return this.formacao;
	}
	public String getNome () {
		return this.nome;
	}		
	public String toString() {
		return " Nome: " + nome + " -  Carga Horaria: " + CargaHoraria + " - formacao: " + formacao;
	}
}

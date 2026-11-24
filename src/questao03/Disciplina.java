package questao03;

public class Disciplina {
	private String nome;
	private int Codigo;
	private String CargaHoraria;
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargaHoraria(String Numero) {
		this.CargaHoraria = Numero;
	}
	public void setCodigo (int Codigo) {
		this.Codigo = Codigo;
	}

	
	public int getCodigo () {
		return this.Codigo;
	}
	public String getCargaHoraria() {
		return this.CargaHoraria;
	}
	public String getNome () {
		return this.nome;
	}		
	public String toString() {
		return " Nome: " + nome + " -  Codigo: " + Codigo + " - Carga Horaria: " + CargaHoraria;
	}
}


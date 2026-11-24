package questao03;

public class Turma {
	private int Codigo;
	private String Turno;
	private int QuantidadeAlunos;
		
	public void setCodigo(int nome) {
		this.Codigo = nome;
	}
	public void setQuantidadeAlunos(int Numero) {
		this.QuantidadeAlunos = Numero;
	}
	public void setTurno (String Turno) {
		this.Turno = Turno;
	}

	
	public String getCarga () {
		return this.Turno;
	}
	public int getQuantidadeAlunos() {
		return this.QuantidadeAlunos;
	}
	public int getCodigo () {
		return this.Codigo;
	}		
	public String toString() {
		return " Codigo: " + Codigo + " -  Turno: " + Turno + " - Quantidade Alunos: " + QuantidadeAlunos;
	}
}


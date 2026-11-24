package questao07;

public class Funcionario {

    private String Nome;
    private String Matricula;
    private double Salario;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.Salario = salario;
        }
    }

    public String getNome() {
        return this.Nome;
    }

    public String getMatricula() {
        return this.Matricula;
    }

    public double getSalario() {
        return this.Salario;
    }
    public String toString() {
		return " Nome: " + Nome + " -  Salario: " + Salario + " - Matricula: " + Matricula;
	}
}
package questao06;

public class Vendedor {

	  private String Nome;
	    private String Matricula;
	    private double Comissao;

	    public void setNome(String nome) {
	        this.Nome = nome;
	    }

	    public void setMatricula(String matricula) {
	        this.Matricula = matricula;
	    }

	    public void setComissao(double comissao) {
	        if (comissao >= 0) {
	            this.Comissao = comissao;
	        }
	    }

	    public String getNome() {
	        return this.Nome;
	    }

	    public String getMatricula() {
	        return this.Matricula;
	    }

	    public double getComissao() {
	        return this.Comissao;
	    }
	    public String toString() {
			return " Nome: " + Nome + " -  Comissao: " + Comissao + " - Matricula: " + Matricula;
		}
	}
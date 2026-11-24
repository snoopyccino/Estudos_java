package questao05;

public class Palestrante {

	   private String Nome;
	    private String AreaAtuacao;
	    private String Titulacao;

	    public void setNome(String nome) {
	        this.Nome = nome;
	    }

	    public void setAreaAtuacao(String area) {
	        this.AreaAtuacao = area;
	    }

	    public void setTitulacao(String titulacao) {
	        this.Titulacao = titulacao;
	    }

	    public String getNome() {
	        return this.Nome;
	    }

	    public String getAreaAtuacao() {
	        return this.AreaAtuacao;
	    }

	    public String getTitulacao() {
	        return this.Titulacao;
	    }
	    public String toString() {
			return " Nome: " + Nome + " -  Area de atuacao: " + AreaAtuacao + " - Titulacao: " + Titulacao;
		}
	}
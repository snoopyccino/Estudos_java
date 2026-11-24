package questao08;

public class Filme {

    private String Titulo;
    private int Duracao;
    private String Classificacao;

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.Duracao = duracao;
    }

    public void setClassificacao(String classificacao) {
        this.Classificacao = classificacao;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public int getDuracao() {
        return this.Duracao;
    }

    public String getClassificacao() {
        return this.Classificacao;
    }
    public String toString() {
		return " Titulo: " + Titulo + " -  Duracao: " + Duracao + " - Classificacao: " + Classificacao;
	}
} 
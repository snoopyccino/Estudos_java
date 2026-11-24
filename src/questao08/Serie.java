package questao08;
public class Serie {

    private String Titulo;
    private int Temporadas;
    private String Classificacao;

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas > 0) {
            this.Temporadas = temporadas;
        }
    }

    public void setClassificacao(String classificacao) {
        this.Classificacao = classificacao;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public int getTemporadas() {
        return this.Temporadas;
    }

    public String getClassificacao() {
        return this.Classificacao;
    }
    public String toString() {
		return " Titulo: " + Titulo + " -  Temporada: " + Temporadas + " - Classificacao: " + Classificacao;
	}
}

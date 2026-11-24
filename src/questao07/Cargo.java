package questao07;

public class Cargo {

    private String Titulo;
    private String Nivel;
    private String Descricao;

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setNivel(String nivel) {
        this.Nivel = nivel;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public String getNivel() {
        return this.Nivel;
    }

    public String getDescricao() {
        return this.Descricao;
    }
    public String toString() {
		return " Titulo: " + Titulo + " -  Nivel: " + Nivel + " - Descricao: " + Descricao;
	}
}
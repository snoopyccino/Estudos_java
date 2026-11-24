package questao04;

public class Motorista {

    private String Nome;
    private String CNH;
    private String Categoria;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setCNH(String cnh) {
        this.CNH = cnh;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getCNH() {
        return this.CNH;
    }

    public String getCategoria() {
        return this.Categoria;
    }
    public String toString() {
		return " Nome: " + Nome + " -  CNH: " + CNH + " - Categoria: " + Categoria;
	}
}
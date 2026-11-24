package questao04;

public class Motorista {

    private String nome;
    private String CNH;
    private String categoria;

    public Motorista() {}

    public Motorista(String nome, String CNH, String categoria) {
        this.nome = nome;
        this.CNH = CNH;
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCNH() {
        return this.CNH;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public String toString() {
        return "Nome: " + nome + " - CNH: " + CNH + " - Categoria: " + categoria;
    }

}
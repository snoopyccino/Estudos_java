package questao03;

public class Professor {

    private String nome;
    private String formacao;
    private int cargaHoraria;

    public Professor() {

    }

    public Professor(String nome, String formacao, int cargaHoraria) {
        this.nome = nome;
        this.formacao = formacao;
        setCargaHoraria(cargaHoraria);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            this.cargaHoraria = 0;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public String toString() {
        return "Nome: " + nome + " - Formacao: " + formacao + " - Carga horaria: " + cargaHoraria;
    }

}
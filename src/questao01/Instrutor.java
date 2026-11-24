package questao01;

public class Instrutor {

    private String nome;
    private String especialidade;

    public Instrutor() {}

    public Instrutor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome do instrutor: " + nome + " - Especialidade: " + especialidade;
    }

}


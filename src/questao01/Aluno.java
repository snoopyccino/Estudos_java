package questao01;

public class Aluno {

    private String nome;
    private String matricula;
    private int idade;

    public Alunos() {}

    public Alunos(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        setIdade(idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Idade: " + idade + " - Matricula: " + matricula;
    }

}
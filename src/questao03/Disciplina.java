package questao03;

public class Disciplina {

    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Disciplina() {}

    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        setCargaHoraria(cargaHoraria);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCodigo() {
        return this.codigo;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public String toString() {
        return "Nome: " + nome + " - Codigo: " + codigo + " - Carga horaria: " + cargaHoraria;
    }

}


package questao03;

public class Turma {

    private String codigo;
    private String turno;
    private int quantidadeAlunos;

    public Turma() {}

    public Turma(String codigo, String turno, int quantidadeAlunos) {
        this.codigo = codigo;
        this.turno = turno;
        setQuantidadeAlunos(quantidadeAlunos);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if(quantidadeAlunos >= 0) {
            this.quantidadeAlunos = quantidadeAlunos;
        } else {
            this.quantidadeAlunos = 0;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getTurno() {
        return this.turno;
    }

    public int getQuantidadeAlunos() {
        return this.quantidadeAlunos;
    }

    public String toString() {
        return "Codigo: " + codigo + " - Turno: " + turno + " - Quantidade de alunos: " + quantidadeAlunos;
    }

}

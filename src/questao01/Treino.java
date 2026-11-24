package questao01;

public class Treino {

    private String codigo;
    private String objetivo;
    private int duracao;

    public Treino() {}

    public Treino(String codigo, String objetivo, int duracao) {
        this.codigo = codigo;
        this.objetivo = objetivo;
        setDuracao(duracao);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setDuracao(int duracao) {
        if(duracao >= 0) {
            this.duracao = duracao;
        } else {
            this.duracao = 0;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public int getDuracao() {
        return this.duracao;
    }

    @Override
    public String toString() {
        return "Codigo do treino: " + codigo + " - Objetivo: " + objetivo + " - Duracao do treino: " + duracao + "m";
    }

}
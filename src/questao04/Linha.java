package questao04;

public class Linha {

    private String codigo;
    private String destinoFinal;
    private double extensao;

    public Linha() {}

    public Linha(String codigo, String destinoFinal, double extensao) {
        this.codigo = codigo;
        this.destinoFinal = destinoFinal;
        this.extensao = extensao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDestinoFinal() {
        return this.destinoFinal;
    }

    public double getExtensao() {
        return this.extensao;
    }

    public String toString() {
        return "Codigo: " + codigo + " - Destino final: " + destinoFinal + " - Extensao: " + extensao;
    }

}
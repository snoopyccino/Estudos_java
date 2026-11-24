package questao04;

public class Linha {


    private String Codigo;
    private String DestinoFinal;
    private double Extensao;

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public void setDestinoFinal(String destino) {
        this.DestinoFinal = destino;
    }

    public void setExtensao(double extensao) {
        this.Extensao = extensao;
    }

    public String getCodigo() {
        return this.Codigo;
    }

    public String getDestinoFinal() {
        return this.DestinoFinal;
    }

    public double getExtensao() {
        return this.Extensao;
    }
    public String toString() {
		return " Codigo: " + Codigo + " -  Destino final: " + DestinoFinal + " - Extensao: " + Extensao;
	}
}

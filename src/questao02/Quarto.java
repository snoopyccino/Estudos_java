package questao02;

public class Quarto {

    private int numero;
    private String tipo;
    private double valorDiaria;

    public Quarto() {}

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        setValorDiaria(valorDiaria);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValorDiaria(double valorDiaria) {
        if(valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        } else {
            this.valorDiaria = 0;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + " - Tipo: " + tipo + " - Valor da diaria: " + valorDiaria;
    }

};
    }
	public String toString() {
		return " Tipo do quarto: " + Tipo + " -  numero: " + Numero + " - Valor da diaria: " + ValorDiaria;}
}


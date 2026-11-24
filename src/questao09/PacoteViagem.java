package questao09;

public class PacoteViagem {

	   private String Destino;
	    private double Valor;
	    private int Duracao;

	    public void setDestino(String destino) {
	        this.Destino = destino;
	    }

	    public void setValor(double valor) {
	        if (valor > 0) {
	            this.Valor = valor;
	        }
	    }

	    public void setDuracao(int duracao) {
	        if (duracao > 0) {
	            this.Duracao = duracao;
	        }
	    }

	    public String getDestino() {
	        return this.Destino;
	    }

	    public double getValor() {
	        return this.Valor;
	    }

	    public int getDuracao() {
	        return this.Duracao;
	    }
	    public String toString() {
			return " Destino: " + Destino + " -  Valor: " + Valor + " - Duracao: " + Duracao;
		}
	}
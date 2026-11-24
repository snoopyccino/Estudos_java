package questao07;

public class Departamento {

    private String Nome;
    private String Ramal;
    private String Localizacao;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setRamal(String ramal) {
        this.Ramal = ramal;
    }

    public void setLocalizacao(String localizacao) {
        this.Localizacao = localizacao;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getRamal() {
        return this.Ramal;
    }

    public String getLocalizacao() {
        return this.Localizacao;
    }
    public String toString() {
		return " Nome: " + Nome + " -  Ramal: " + Ramal + " - Localizacao: " + Localizacao;
	}
}
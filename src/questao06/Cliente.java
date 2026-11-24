package questao06;

public class Cliente {

    private String Nome;
    private String CPF;
    private String Telefone;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getTelefone() {
        return this.Telefone;
    }
    public String toString() {
		return " Nome: " + Nome + " -  CPF: " + CPF + " - Telefone : " + Telefone;
	}
}
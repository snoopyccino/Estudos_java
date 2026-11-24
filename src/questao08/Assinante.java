package questao08;

public class Assinante {


    private String Nome;
    private String Email;
    private String Plano;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPlano(String plano) {
        this.Plano = plano;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPlano() {
        return this.Plano;
    }
    public String toString() {
		return " Nome: " + Nome + " -  Email: " + Email + " - Plano: " + Plano;
	}
} 
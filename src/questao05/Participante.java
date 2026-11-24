package questao05;

public class Participante {

    private String Nome;
    private String Email;
    private String Empresa;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setEmail(String email) {
        if (email.equals(email.toLowerCase()) && email.contains("@")) {
            this.Email = email;
        }
    }

    public void setEmpresa(String empresa) {
        this.Empresa = empresa;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getEmpresa() {
        return this.Empresa;
    }
    public String toString() {
		return " Nome: " + Nome + " -  Email: " + Email + " - Empresa: " + Empresa;
	}
} 
package questao02;

public class Hospede {
    private String Nome;
    private String Documento;
    private String Telefone;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setDocumento(String documento) {
        this.Documento = documento;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getDocumento() {
        return this.Documento;
    }

    public String getTelefone() {
        return this.Telefone;
    }
    public String toString() {
		return " Nome: " + Nome + " -  Documento: " + Documento + " - Telefone: " + Telefone;}
}
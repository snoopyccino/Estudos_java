package questao02;

public class Hospede {

    private String nome;
    private String documento;
    private String telefone;

    public Hospede() {}

    public Hospede(String nome, String documento, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Documento: " + documento + " - Telefone: " + telefone;
    }

}
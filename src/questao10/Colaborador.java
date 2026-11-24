package questao10;

public class Colaborador {
	private String Nome;
	private String cargo;
	private String email;
		
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setEmail(String Numero) {
		this.email = Numero;
	}
	public void setCargo (String Documento) {
		this.cargo = Documento;
	}

	
	public String getCargo () {
		return this.cargo;
	}
	public String getEmail() {
		return this.email;
	}
	public String getNome () {
		return this.Nome;
	}	
}
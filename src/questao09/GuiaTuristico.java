package questao09;

public class GuiaTuristico {

	  private String Nome;
	    private String Idioma;
	    private String Registro;

	    public void setNome(String nome) {
	        this.Nome = nome;
	    }

	    public void setIdioma(String idioma) {
	        this.Idioma = idioma;
	    }

	    public void setRegistro(String registro) {
	        this.Registro = registro;
	    }

	    public String getNome() {
	        return this.Nome;
	    }

	    public String getIdioma() {
	        return this.Idioma;
	    }

	    public String getRegistro() {
	        return this.Registro;
	    }
	    public String toString() {
			return " Nome: " + Nome + " -  Idioma: " + Idioma + " - Registro: " + Registro;
		}
	}
package questao09;

public class TesteTurista {

	public static void Cliente() {
		Cliente C1 = new Cliente();
		C1.setCPF("534-346-343-23");
		C1.setNome("Andre");
		C1.setTelefone("71 932812123");
		System.out.println(C1);
	}
	public static void GuiaTuristico() {
		GuiaTuristico G1 = new GuiaTuristico();
		G1.setNome("Joao");
		G1.setIdioma("Ingles");
		G1.setRegistro("5043920");
		System.out.println(G1);
		
	}
	public static void PacoteDeViagem() {
	PacoteViagem P1 = new PacoteViagem();
	P1.setDuracao(50);
	P1.setDestino("Afeganistao");
	P1.setValor(50.43);
	System.out.println(P1);
	}
		
		public static void main(String[] args) {
		Cliente();
		GuiaTuristico();
		PacoteDeViagem();
		}

	}

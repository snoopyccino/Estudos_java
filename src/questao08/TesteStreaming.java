package questao08;

public class TesteStreaming {

	public static void Assinante() {
		Assinante A1 = new Assinante();
		A1.setEmail("mOISES@Gmail.com");
		A1.setNome("Antonio");
		A1.setPlano("Gold");
		System.out.println(A1);
		
	}
	public static void Filme() {
		Filme F1 = new Filme();
		F1.setClassificacao("5/5");
		F1.setDuracao(180);
		F1.setTitulo("Rei leao");
		System.out.println(F1);
		
	}
	public static void Serie() {
	Serie S1 = new Serie();
	S1.setClassificacao("5/5");
	S1.setTemporadas(5);
	S1.setTitulo("Gumball");
	System.out.println(S1);
		
	}
		
		public static void main(String[] args) {
		Assinante();
		Filme();
		Serie();
		}

	}

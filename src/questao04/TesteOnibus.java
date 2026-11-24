package questao04;

public class TesteOnibus {

	public static void Linha() {
		Linha l1 = new Linha();
		l1.setCodigo("3");
		l1.setDestinoFinal("Lapa");
		l1.setExtensao(2);
		System.out.println(l1);
		
	}
	public static void Motorista() {
		Motorista m1 = new Motorista();
		m1.setNome("Vinicius");
		m1.setCNH("32109");
		m1.setCategoria("B");
		System.out.println(m1);
		
	}
	public static void Onibus() {
		Onibus o1 = new Onibus();
		o1.setPlaca("SKC-54BF");
		o1.setModelo("SEDAN");
		o1.setCapacidade(30);
		System.out.println(o1);
	}
		
		public static void main(String[] args) {
	Linha();
		
		Motorista();
		Onibus();
		}

	}

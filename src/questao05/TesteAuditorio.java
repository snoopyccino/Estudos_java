package questao05;

public class TesteAuditorio {

	public static void Palestra() {
		Palestra p1 = new Palestra();
		p1.setTema("Saude mental");
		p1.setDuracao(180);
		p1.setSala(5);
		System.out.println(p1);
		
	}
	public static void Palestrante() {
		Palestrante p1 = new Palestrante();
		p1.setNome("Joao");
		p1.setAreaAtuacao("Saude");
		p1.setTitulacao("Coach");
		System.out.println(p1);
		
	}
	public static void Participante() {
		Participante p1 = new Participante();
		p1.setNome("Moises");
		p1.setEmail("moisesssampaiio@gmail.com");
		p1.setEmpresa("Atakadao");
		System.out.println(p1);
	}
		
		public static void main(String[] args) {
		Palestra();
		
		Palestrante();
		Participante();
		}

	}

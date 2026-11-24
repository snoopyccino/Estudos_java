package questao02;

public class TesteHotel {

	public static void Hospede() {
		Hospede h1 = new Hospede();
		h1.setNome("João");
		h1.setDocumento("33425599");
		h1.setTelefone("71 997885677");
		System.out.println(h1);
		
	}
	public static void Quarto() {
		Quarto q1 = new Quarto();
		q1.setNumero(33);
		q1.setTipo("Deluxe");
		q1.setValorDiaria(55.69);
		System.out.println(q1);
		
	}
	public static void Reserva() {
		Reserva r1 = new Reserva();
		r1.setDataEntrada("06/07/2022");
		r1.setDataSaida("08/07/2022");
		r1.setStatus("encerrado");
		System.out.println(r1);
	}
		
		public static void main(String[] args) {
		Hospede();
		
		Quarto();
		Reserva();
		}

	}


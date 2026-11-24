package questao06;

public class TesteCarroloja {


	public static void Cliente() {
		Cliente C1 = new Cliente();
		C1.setCPF("544-432-132-32");
		C1.setNome("Carlos");
		C1.setTelefone("71997232012");
		System.out.println(C1);
		
	}
	public static void Veiculo() {
		Veiculo V1 = new Veiculo();
		V1.setMarca("Toyota");
		V1.setModelo("Sedan");
		V1.setValor(100000.23);
		System.out.println(V1);
	}
	public static void Vendedor() {
		Vendedor VE1 = new Vendedor();
		VE1.setComissao(5000);
		VE1.setMatricula("543432");
		VE1.setNome("Pedro");
		System.out.println(VE1);
	}
		
		public static void main(String[] args) {
		Cliente();
		Veiculo();
		Vendedor();
		}

	}

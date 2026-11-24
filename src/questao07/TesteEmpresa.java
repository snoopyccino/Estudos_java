package questao07;

public class TesteEmpresa {

	public static void Cargo() {
		Cargo C1 = new Cargo();
		C1.setDescricao("Cuida das principais funcoes da empresa");
		C1.setNivel("4");
		C1.setTitulo("Administrativo");
		System.out.println(C1);
	}
	public static void Departamento() {
		Departamento D1 = new Departamento();
		D1.setLocalizacao("4 ANDAR");
		D1.setNome("Financeiro");
		D1.setRamal("Teste");
		System.out.println(D1);
	}
	public static void Funcionario() {
	Funcionario F1 = new Funcionario();
	F1.setNome("Carlos");
	F1.setMatricula("43432");
	F1.setSalario(1500.90);
	System.out.println(F1);
	}
		
		public static void main(String[] args) {
		Cargo();
		Departamento();
		Funcionario();
		}

	}

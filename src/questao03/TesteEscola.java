package questao03;

public class TesteEscola {

		public static void Disciplina() {
			Disciplina d1 = new Disciplina();
			d1.setNome("Matematica");
			d1.setCodigo(33);
			d1.setCargaHoraria("20:00");
			System.out.println(d1);
			
		}
		public static void Professor() {
			Professor p1 = new Professor();
			p1.setNome("Maria");
			p1.setCarga("8:00");
			p1.setFormacao("Matematica");
			System.out.println(p1);
			
		}
		public static void Turma() {
			Turma t1 = new Turma();
			t1.setCodigo(88);
			t1.setTurno("Tarde");
			t1.setQuantidadeAlunos(44);
			System.out.println(t1);
		}
			
			public static void main(String[] args) {
			Disciplina();
			
			Professor();
			Turma();
			}

		}

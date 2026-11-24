package questao01;

	public class TesteEscola {
		 
		    public static void alunos() {
		 
		      Aluno a1 = new Aluno();
		      a1.setIdade(15);
		      a1.setMatricula("3342");
		      a1.setNome("Moises");
		      System.out.println(a1);
		 
		      Aluno a2 = new Aluno("Joao", "3343", 20);
	          System.out.println(a2);
		 
		    }
		 
		    public static void instrutor() {
		 
		        Instrutor i1 = new Instrutor();
		        i1.setNome("Joao");
		        i1.setEspecialidade("Professor");
		        System.out.println(i1);
		 
		        Instrutor i2 = new Instrutor("Ze", "Natacao");
		        System.out.println(i2);
		 
		    }
		 
		    public static void treino() {
		 
		        Treino t1 = new Treino();
		        t1.setCodigo("43");
		        t1.setDuracao(50);
		        t1.setObjetivo("Engordar");
		        System.out.println(t1);
		 
		        Treino t2 = new Treino("44", "Emagrecer", 40);
		        System.out.println(t2);
		 
		    }
		 
		    public static void main(String[] args) {
		 
		        alunos();
		 
		        instrutor();
		 
		        treino();
		 
		    }
		 
		}	
package questao01;

	public class TesteEscola {

    public static void alunos() {

        Alunos a1 = new Alunos();
        System.out.println(a1);

        Alunos a2 = new Alunos("Moises", "3342", 15);
        System.out.println(a2);

    }

    public static void instrutor() {

        Instrutor i1 = new Instrutor();
        System.out.println(i1);

        Instrutor i2 = new Instrutor("Joao", "Professor");
        System.out.println(i2);

    }

    public static void treino() {

        Treino T1 = new Treino();
        System.out.println(T1);

        Treino T2 = new Treino("43", "Engordar", 50);
        System.out.println(T2);

    }

    public static void main(String[] args) {

        alunos();
        instrutor();
        treino();

    }

}
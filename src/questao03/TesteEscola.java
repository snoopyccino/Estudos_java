package questao03;

public class TesteEscola {

    public static void professor() {

        Professor p1 = new Professor();
        System.out.println(p1);

        Professor p2 = new Professor("Ana", "Matematica", 40);
        System.out.println(p2);

    }

    public static void disciplina() {

        Disciplina d1 = new Disciplina();
        System.out.println(d1);

        Disciplina d2 = new Disciplina("Java", "JAV01", 60);
        System.out.println(d2);

    }

    public static void turma() {

        Turma t1 = new Turma();
        System.out.println(t1);

        Turma t2 = new Turma("T01", "Manha", 30);
        System.out.println(t2);

    }

    public static void main(String[] args) {

        professor();
        disciplina();
        turma();

    }

}


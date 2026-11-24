package questao04;

public class TesteOnibus {

    public static void motorista() {

        Motorista m1 = new Motorista();
        System.out.println(m1);

        Motorista m2 = new Motorista("Carlos", "123456789", "D");
        System.out.println(m2);

    }

    public static void onibus() {

        Onibus o1 = new Onibus();
        System.out.println(o1);

        Onibus o2 = new Onibus("ABC1D23", 40, "Mercedes");
        System.out.println(o2);

    }

    public static void linha() {

        Linha l1 = new Linha();
        System.out.println(l1);

        Linha l2 = new Linha("100", "Centro", 25.5);
        System.out.println(l2);

    }

    public static void main(String[] args) {

        motorista();
        onibus();
        linha();

    }

}
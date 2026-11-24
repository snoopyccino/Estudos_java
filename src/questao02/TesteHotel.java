package questao02;

public class TestesHotel {

    public static void hospede() {

        Hospede h1 = new Hospede();
        System.out.println(h1);

        Hospede h2 = new Hospede("Maria", "123456789", "71999999999");
        System.out.println(h2);

    }

    public static void quarto() {

        Quarto q1 = new Quarto();
        System.out.println(q1);

        Quarto q2 = new Quarto(101, "Casal", 250.0);
        System.out.println(q2);

    }

    public static void reserva() {

        Reserva r1 = new Reserva();
        System.out.println(r1);

        Reserva r2 = new Reserva("01/12/2026", "05/12/2026", "Confirmada");
        System.out.println(r2);

    }

    public static void main(String[] args) {

        hospede();
        quarto();
        reserva();

    }

}

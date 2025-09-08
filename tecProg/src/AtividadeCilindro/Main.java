package AtividadeCilindro;

public class Main {

    public static void main(String[] args) {
        Cilindro c = new Cilindro();
        c.setRaio(5);
        c.setAltura(10);
        double reraio = c.getRaio();
        double realtura = c.getAltura();
        System.out.println(reraio);
        System.out.println(realtura);
        System.out.println("O volume do cilindro é: ");
        c.mostrarVolume();
    }
}

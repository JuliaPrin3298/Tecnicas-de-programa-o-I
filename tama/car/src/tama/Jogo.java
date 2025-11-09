package tama;

public class Jogo {
    public boolean ativo;
    public int tempoDeJogo;
    public String animalAtual;

    private Thread contadorThread;

    public void iniciar() {
        ativo = true;
        tempoDeJogo = 0;
        System.out.println("Inicializando Tamagotchi...");

        contadorThread = new Thread(() -> {
            while (ativo) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tempoDeJogo++;
              //  System.out.println("Tempo de Jogo: " + tempoDeJogo);
            }
        });
        contadorThread.start();
    }

    public void desligar() {
        ativo = false;
        System.out.println("Jogo desligado. Tempo final: " + tempoDeJogo);
    }

    public static void main(String[] args) throws InterruptedException {
        Jogo jogo = new Jogo();
        Cachorro animal = new Cachorro();
        jogo.iniciar();
        System.out.println(animal.EmetirSom()); 
        Thread.sleep(3000);
        jogo.desligar();
    }
}

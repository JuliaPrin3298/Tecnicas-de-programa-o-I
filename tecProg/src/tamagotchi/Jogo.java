package tamagotchi;

import java.util.ArrayList;
import java.util.List;

import tamagotchi.Animal;

public class Jogo {
    public boolean ativo;
    public int tempoDeJogo;
    public List<Animal> animais = new ArrayList<>();
    public String animalAtual;

    private Thread contadorThread;

    public void iniciar() {
        ativo = true;
        tempoDeJogo = 0;
        System.out.println("Inicializando Tamagotchi...");

        contadorThread = new Thread(() -> {
            while (ativo) {
                try {
                    Thread.sleep(1000); // espera 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tempoDeJogo++;
                System.out.println("Tempo de Jogo: " + tempoDeJogo);
            }
        });
        contadorThread.start();
    }

    public void desligar() {
        ativo = false; // para o loop
        System.out.println("Jogo desligado. Tempo final: " + tempoDeJogo);
    }

    public static void main(String[] args) throws InterruptedException {
        Jogo jogo = new Jogo();

        jogo.iniciar(); // inicia o contador
        Thread.sleep(5000); // espera 5 segundos

        jogo.desligar(); // desliga o contador
    }
}

import java.util.concurrent.Semaphore;
import java.util.Random;

class SalaLettura {
    private Semaphore semaforo;

    public SalaLettura(int postiDisponibili) {
        this.semaforo = new Semaphore(postiDisponibili);
    }

    public void entra() {
        try {
            semaforo.acquire();
            System.out.println(Thread.currentThread().getName() + " è entrato nella sala di lettura.");
            Random r = new Random();
            int tempoLettura = r.nextInt(5000) + 1000;
            Thread.sleep(tempoLettura); // Simula il tempo di lettura
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void esci() {
        System.out.println(Thread.currentThread().getName() + " ha lasciato la sala di lettura.");
        semaforo.release();
    }
}

class Studente extends Thread {
    private SalaLettura sala;

    public Studente(SalaLettura sala) {
        this.sala = sala;
    }

    public void run() {
        sala.entra();
        sala.esci();
    }
}

public class TestSalaLettura {
    public static void main(String[] args) {
        SalaLettura sala = new SalaLettura(3); // Sala con 3 posti disponibili

        // Creazione di 5 studenti che tentano di entrare nella sala di lettura
        for (int i = 0; i < 10; i++) {
            new Studente(sala).start();
        }
    }
}
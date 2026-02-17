package day_14.virtualthreads;

import java.util.Random;

public class virtualThreads {
    public static void main(String[] args) {
        boolean threadsVirtuaisHabilitadas = true;
        System.out.println("Virtual threads ligadas?"+ threadsVirtuaisHabilitadas);

        long inicio = System.currentTimeMillis();

        Random random = new Random();

        Runnable runnable =() -> {
            Integer i = random.nextInt(999999999);
        };
        for (int i = 0; i < 500; i++) {
            if(threadsVirtuaisHabilitadas){
                Thread.startVirtualThread(runnable);
            }else{
                Thread thread = new Thread(runnable);
                thread.start();
            }
        }
        long fim = System.currentTimeMillis();

        long tempoGasto = fim - inicio;
        System.out.println("Tempo gasto na execução " + tempoGasto);

    }
}

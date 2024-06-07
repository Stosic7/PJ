// Prva nit koja ispisuje svoje ime 5 puta sa pauzom od 5 sekundi
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": iteration " + (i + 1));
            try {
                Thread.sleep(5000); // Pauza od 5 sekundi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Druga nit koja ispisuje svoje ime 5 puta sa pauzom od 2 sekunde
class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": iteration " + (i + 1));
            try {
                Thread.sleep(2000); // Pauza od 2 sekunde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();

        thread1.setName("Thread1");
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}

/* OUTPUT:
Thread1: iteration 1
Thread2: iteration 1
Thread2: iteration 2
Thread1: iteration 2
Thread2: iteration 3
Thread2: iteration 4
Thread1: iteration 3
Thread2: iteration 5
Thread1: iteration 4
Thread1: iteration 5
Both threads have finished execution.

Nit Thread1 ispisuje 5 puta sa pauzom od 5 sekundi, dakle, ukupno 5 * 5 sekundi = 25 sekundi.
Nit Thread2 ispisuje 5 puta sa pauzom od 2 sekunde, dakle, ukupno 5 * 2 sekundi = 10 sekundi.
Ukupno vreme izvršenja programa biće određeno trajanjem duže niti, što je Thread1 sa približno 25 sekundi. Budući da niti rade paralelno, 
celokupno vreme izvršenja programa će biti približno 25 sekundi, jer se Thread2 završava ranije.
*/

public class BankovniRacun {
    private double stanjeRacuna;

    public BankovniRacun(double pocetnoStanje) {
        this.stanjeRacuna = pocetnoStanje;
    }

    public synchronized void promeniStanje(double iznos) {
        stanjeRacuna += iznos;
    }

    public synchronized double citajStanje() {
        return stanjeRacuna;
    }

    public static void main(String[] args) {
        BankovniRacun racun = new BankovniRacun(1000);

        // Niti za promenu stanja
        Thread t1 = new Thread(() -> {
            racun.promeniStanje(500); // Dodajemo 500 na račun
        });

        Thread t2 = new Thread(() -> {
            racun.promeniStanje(-300); // Skidamo 300 sa računa
        });

        // Nit za čitanje stanja
        Thread t3 = new Thread(() -> {
            System.out.println("Trenutno stanje: " + racun.citajStanje());
        });

        // Pokretanje niti
        t1.start();
        t2.start();
        t3.start();

        // Čekanje da se sve niti završe
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ispisujemo konačno stanje
        System.out.println("Konačno stanje: " + racun.citajStanje());
    }
}

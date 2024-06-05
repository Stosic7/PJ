import java.util.concurrent.Callable;

public class Kocka extends Kvadrat implements Callable<Double> {

    public Kocka(double a) {
        super(a);
    }

    public double povrsina() {
        return 6 * super.povrsina();
    }

    @Override
    public Double call() {
        return povrsina();
    }
}

/*Da bismo omogućili da se funkcija za izračunavanje površine izvršava u jednoj niti, možemo koristiti Callable interfejs iz paketa java.util.concurrent.
  U ovom primeru, klasa Kocka implementira interfejs Callable<Double>. Ovo zahteva da se preklopi metoda call(), koja vraća rezultat izračunavanja površine. 
  Funkcija povrsina() ostaje ista kao u originalnom zadatku. Kada klasa Kocka bude korišćena zajedno sa ExecutorService-om, može se pokrenuti u jednoj niti, 
  a rezultat izračunavanja površine može biti dobijen pozivom get() metode nad Future objektom koji se dobije kao rezultat poziva submit() metode.*/

public class Kocka extends Kvadrat
{
    public Kocka(double a) {
        // this.a = a; - ovo ne treba
        super(a); // Poziv konstruktora bazne klase Kvadrat
    }
    
    @Override
    public double površina() {
        //  return 6*površina() - ovo ne, jer nema super
        return 6 * super.površina(); // Preklopljeni metod površina iz bazne klase Kvadrat
    }
}


//Nedostaje poziv konstruktora bazne klase Kvadrat u konstruktoru klase Kocka.
//Metoda površina u klasi Kocka treba da preklopi metod površina iz bazne klase Kvadrat.

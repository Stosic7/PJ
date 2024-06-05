public interface Interfejs
{
    int zbir(int x);
    double proizvod(double x);
}

public class Klasa implements Interfejs
{
    private int x;
    
    public Klasa(int x)
    {
        this.x = x;
    }
    
    @Override
    public int zbir(int x)
    {
        return x + this.x;
    }
    
    @Override
    public double proizvod(double x)
    {
        return x * this.x;
    }
}

// Uklonjen je public ispred metoda u interfejsu jer su svi metodi interfejsa automatski javni.
// Uklonjen tip podataka Integer i umesto toga koristi se int u metodi zbir.
// Ispravljeno je korišćenje metode intValue() u metodi zbir. Pravilna sintaksa za dobijanje vrednosti int-a iz objekta Integer je intValue(), ali u ovom slučaju, obzirom da smo promenili tip argumenta metode u int, direktno možemo koristiti vrednost x.

public class Klasa implements Comparable<Klasa>
{
    private int broj;
    
    public Klasa(int broj)
    {
        this.broj = broj;
    }
    
    public int vratiBroj()
    {
        return broj;
    }

    @Override
    public int compareTo(Klasa other)
    {
        return Integer.compare(this.broj, other.broj);
    }

    @Override
    public String toString()
    {
        return "Klasa{broj=" + broj + "}";
    }
}

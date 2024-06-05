class Matrica : IMatrica
{
    private double[,] elementi;

    public Matrica(int brojVrsta, int brojKolone)
    {
        BrojVrsta = brojVrsta;
        BrojKolone = brojKolone;
        elementi = new double[brojVrsta, brojKolone];
    }

    public double this[int i, int j]
    {
        get => elementi[i, j];
        set => elementi[i, j] = value;
    }

    public int BrojVrsta { get; }
    public int BrojKolone { get; }

    public static Matrica operator +(Matrica a, Matrica b)
    {
        if (a.BrojVrsta != b.BrojVrsta || a.BrojKolone != b.BrojKolone)
            throw new InvalidOperationException("Sabiranje matrica nije moguće jer matrice nisu istih dimenzija.");

        Matrica rezultat = new Matrica(a.BrojVrsta, a.BrojKolone);
        for (int i = 0; i < a.BrojVrsta; i++)
        {
            for (int j = 0; j < a.BrojKolone; j++)
            {
                rezultat[i, j] = a[i, j] + b[i, j];
            }
        }
        return rezultat;
    }
}

using System;

public class ZbirKvadrata
{
    public static int IzracunajZbirKvadrata(params int[] brojevi)
    {
        int zbirKvadrata = 0;
        foreach (int broj in brojevi)
        {
            zbirKvadrata += broj * broj;
        }
        return zbirKvadrata;
    }

    public static void Main(string[] args)
    {
        int sumaKvadrata = IzracunajZbirKvadrata(1, 2, 3, 4, 5);
        Console.WriteLine("Zbir kvadrata prvih 5 prirodnih brojeva je: " + sumaKvadrata);
    }
}

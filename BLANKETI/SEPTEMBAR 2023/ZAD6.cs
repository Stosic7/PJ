using System;
using System.Threading;

class Stack
{
    private int[] elements;
    private int top; // Indeks vrha steka
    private readonly object lockObject = new object(); // Objekat za zaključavanje

    public Stack(int size)
    {
        elements = new int[size];
        top = -1; // Inicijalno nema elemenata u steku
    }

    public void Push(int element)
    {
        lock (lockObject) // Zaključavanje resursa
        {
            if (top == elements.Length - 1)
            {
                throw new InvalidOperationException("Stek je pun. Nemoguće dodati novi element.");
            }

            top++;
            elements[top] = element;
        }
    }

    public int Pop()
    {
        lock (lockObject) // Zaključavanje resursa
        {
            if (top == -1)
            {
                throw new InvalidOperationException("Stek je prazan. Nemoguće izbaciti element.");
            }

            int element = elements[top];
            top--;
            return element;
        }
    }
}

class Program
{
    static void Main(string[] args)
    {
        Stack stack = new Stack(5);

        // Testiranje dodavanja elemenata
        for (int i = 0; i < 6; i++)
        {
            try
            {
                stack.Push(i);
                Console.WriteLine($"Dodat element {i} na stek.");
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        Console.WriteLine();

        // Testiranje izbacivanja elemenata
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int element = stack.Pop();
                Console.WriteLine($"Izbacen element {element} sa steka.");
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}

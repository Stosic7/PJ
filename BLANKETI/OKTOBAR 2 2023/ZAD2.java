import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class NedefinisanRazlomak extends Exception {
    public NedefinisanRazlomak(String message) {
        super(message);
    }
}

    public static void ucitajIRazmeniRazlomak(String ulaznaDatoteka, String izlaznaDatoteka) throws IOException, NedefinisanRazlomak {
        try (BufferedReader reader = new BufferedReader(new FileReader(ulaznaDatoteka));
             BufferedWriter writer = new BufferedWriter(new FileWriter(izlaznaDatoteka))) {
            String linija = reader.readLine();
            if (linija != null) {
                String[] delovi = linija.split("/");
                int brojnik = Integer.parseInt(delovi[0]);
                int imenilac = Integer.parseInt(delovi[1]);
                if (imenilac == 0) {
                    throw new NedefinisanRazlomak("Imenilac ne može biti nula.");
                }
                double rezultat = (double) brojnik / imenilac;
                writer.write(Double.toString(rezultat));
            }
        }
    }

  public class Main {
    public static void main(String[] args) {
        try {
            ucitajIRazmeniRazlomak("ulaz.txt", "izlaz.bin");
            System.out.println("Razlomak je uspešno ucitan i razmenjen.");
        } catch (Exception ex) {
            System.out.println("Došlo je do greške: " + ex.getMessage());
        }
    }
}

public class Kvadrat {
    private double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    public double površina() {
        return Math.pow(a, 2);
    }

    // Metoda za čitanje atributa iz binarnog toka podataka
    public void ucitajIzBinarnogTok(Stream tok) throws IOException {
        DataInputStream dis = new DataInputStream(tok);
        a = dis.readDouble();
    }

    // Metoda za čitanje atributa iz tekstualnog toka podataka
    public void ucitajIzTekstualnogTok(Stream tok) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(tok));
        a = Double.parseDouble(br.readLine());
    }

    // Metoda za čuvanje atributa u binarni tok podataka
    public void sacuvajUBinarniTok(Stream tok) throws IOException {
        DataOutputStream dos = new DataOutputStream(tok);
        dos.writeDouble(a);
    }

    // Metoda za čuvanje atributa u tekstualni tok podataka
    public void sacuvajUTekstualniTok(Stream tok) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(tok));
        bw.write(Double.toString(a));
        bw.newLine();
        bw.flush();
    }
}

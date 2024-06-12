import java.util.concurrent.Callable;

public class Kocka extends Kvadrat implements Runnable {

    public Kocka(double a) {
        super(a);
    }

    public double povrsina() {
        return 6 * super.povrsina();
    }

    @Override
    public void run()
    {

        double rez = povrsina();
        System.out.println(rez);
        
    }
}


// Definišemo interfejse I1, I2 i I3
interface I1 {
    void methodI1();
}

interface I2 {
    void methodI2();
}

interface I3 {
    void methodI3();
}

// Klasa K1 implementira interfejse I1 i I2
class K1 implements I1, I2 {
    @Override
    public void methodI1() {
        System.out.println("K1: methodI1");
    }

    @Override
    public void methodI2() {
        System.out.println("K1: methodI2");
    }
}

// Klasa K2 implementira interfejse I2 i I3
class K2 implements I2, I3 {
    @Override
    public void methodI2() {
        System.out.println("K2: methodI2");
    }

    @Override
    public void methodI3() {
        System.out.println("K2: methodI3");
    }
}

// Klasa K3 implementira interfejse I1 i I3
class K3 implements I1, I3 {
    @Override
    public void methodI1() {
        System.out.println("K3: methodI1");
    }

    @Override
    public void methodI3() {
        System.out.println("K3: methodI3");
    }
}

public class Main {
    public static void main(String[] args) {
        // Neka je n parni broj koji definišemo
        int n = 10; // Primer parnog broja
        Object[] array = new Object[n];

        // Popunjavamo prvu polovinu niza sa objektima tipa K1
        for (int i = 0; i < n / 2; i++) {
            array[i] = new K1();
        }

        // Popunjavamo drugu polovinu niza sa objektima tipa K2
        for (int i = n / 2; i < n; i++) {
            array[i] = new K2();
        }

        // Prikazujemo sadržaj niza
        for (int i = 0; i < n; i++) {
            System.out.println(array[i].getClass().getName());
        }
    }
}

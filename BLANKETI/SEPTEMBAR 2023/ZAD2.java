class ExcA extends Exception {
    public ExcA() {
        super("Doslo je do greske");
    }
}

class ExcB extends Exception {
    public ExcB(String message) {
        super(message);
    }
}

class MyClass {
    public void mojMetod(boolean throwA) throws ExcA, ExcB {
        if (throwA) {
            throw new ExcA();
        } else {
            throw new ExcB("Proizvoljna greska");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
        try {
            myClass.mojMetod(true); // Testiranje ExcA
        } catch (ExcA e) {
            System.out.println("Uhvaćen ExcA: " + e.getMessage());
        } catch (ExcB e) {
            System.out.println("Uhvaćen ExcB: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Uhvaćen Exception: " + e.getMessage());
        }
        
        try {
            myClass.mojMetod(false); // Testiranje ExcB
        } catch (ExcA e) {
            System.out.println("Uhvaćen ExcA: " + e.getMessage());
        } catch (ExcB e) {
            System.out.println("Uhvaćen ExcB: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Uhvaćen Exception: " + e.getMessage());
        }
    }
}

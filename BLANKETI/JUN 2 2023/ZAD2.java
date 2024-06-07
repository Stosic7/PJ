// Klasa K
class K {
    // Metoda koja može biti predefinisana u izvedenim klasama
    public void methodCanBeOverridden() {
        System.out.println("This method can be overridden.");
    }

    // Metoda koja ne može biti predefinisana u izvedenim klasama
    public final void methodCannotBeOverridden() {
        System.out.println("This method cannot be overridden.");
    }
}

// Izvedena klasa K1 koja pokušava da predefiniše metode
class K1 extends K {
    // Predefinisanje metode koja može biti predefinisana
    @Override
    public void methodCanBeOverridden() {
        System.out.println("This method has been overridden in K1.");
    }

    // Pokušaj predefinisanja metode koja ne može biti predefinisana
    // će izazvati grešku pri kompilaciji
    // @Override
    // public void methodCannotBeOverridden() {
    //     System.out.println("This will cause a compilation error.");
    // }
}

public class Main {
    public static void main(String[] args) {
        K objK = new K();
        K1 objK1 = new K1();

        System.out.println("Calling methods from class K:");
        objK.methodCanBeOverridden();
        objK.methodCannotBeOverridden();

        System.out.println("Calling methods from class K1:");
        objK1.methodCanBeOverridden();
        objK1.methodCannotBeOverridden();  // Ovo će pozvati metodu iz klase K
    }
}

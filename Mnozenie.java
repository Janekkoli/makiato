public class Mnozenie extends Wyrazenie {
    private Wyrazenie wyr1;
    private Wyrazenie wyr2;

    public Mnozenie(Wyrazenie wyr1, Wyrazenie wyr2) {
        this.wyr1 = wyr1;
        this.wyr2 = wyr2;
    }

    @Override
    public int oblicz() throws Stopexeption {
        return wyr1.oblicz() * wyr2.oblicz();
    }
}
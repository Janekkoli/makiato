public class Lit extends Wyrazenie{
    int wartosc;
    public Lit(int wartosc)
    {this.wartosc=wartosc;}

    @Override
    public int oblicz() throws Stopexeption {
        return wartosc;
    }
}

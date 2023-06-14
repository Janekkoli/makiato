public class Przypisanie extends Instrukcja{
    private Zmienna x;
    private Wyrazenie y;
    public  Przypisanie(Zmienna x,Wyrazenie y)
    {
        this.x=x;this.y=y;
    }
    @Override
    public int step() throws Stopexeption {
        x.zmiana(y.oblicz());return 1;
    }
}

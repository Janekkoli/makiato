public class Print extends Instrukcja{
    Wyrazenie wyr;
    public Print(Wyrazenie wyr)
    {this.wyr=wyr;}

    @Override
    public int step() throws Stopexeption {
        System.out.println(wyr.oblicz());
        return 1;
    }
}

public class Modulo extends Wyrazenie{
    private Wyrazenie wyr1;
    private Wyrazenie wyr2;
    public  Modulo(Wyrazenie wyr1,Wyrazenie wyr2)
    {
        this.wyr1=wyr1;
        this.wyr2=wyr2;
    }
    @Override
    public int oblicz() throws Stopexeption
    {
        try {
            return wyr1.oblicz() % wyr2.oblicz();
        }
        catch (ArithmeticException e)
        {
            System.out.println ("Can't be divided by Zero " + e);
            throw new Stopexeption();
        }
    }
}

public class Warunek extends Instrukcja{
    Wyrazenie wyr1;
    Wyrazenie wyr2;
    String znak;
    Blok Then;
    Blok Else;
    Blok Now=null;
    boolean comp () throws Stopexeption
    {
        if(znak.equals("="))
            return wyr1.oblicz() == wyr2.oblicz();
        if(znak.equals("<"))
            return wyr1.oblicz() < wyr2.oblicz();
        if(znak.equals(">"))
            return wyr1.oblicz() > wyr2.oblicz();
        if(znak.equals("<="))
            return wyr1.oblicz() <= wyr2.oblicz();
        if(znak.equals(">="))
            return wyr1.oblicz() >= wyr2.oblicz();
        throw new Stopexeption();
    }
    public Warunek(Wyrazenie wyr1,String znak,Wyrazenie wyr2,Instrukcja[] Then,Instrukcja[] Else)
    {
        this.wyr1=wyr1;this.wyr2=wyr2;this.znak=znak;
        this.Then=new Blok(null,null,Then); //tutaj tez doprecyzowac
        this.Else=new Blok(null,null,Else);
    }
    @Override
    public int step() throws Stopexeption {
        if(Now==null && comp())
            Now=Then;
        if(Now==null && !comp())
            Now=Else;
        if(Now.step()==1 || Now==null)
        {Now=null;return 1;}
        return 0;
    }
}

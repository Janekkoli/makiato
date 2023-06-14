public class Petla extends Instrukcja{
    Wyrazenie wyr;
    private int ile;
    private int wykonanie;
    Zmienna i;
    Blok b;
    public Petla(Zmienna i, Wyrazenie wyr, Instrukcja[] instrukcje)
    {
        this.i=i;
        this.wyr=wyr;
        b=new Blok(new Zmienna[]{i}, null,instrukcje); //poprawka w definicji bloku
        ile=-1;
    }
    @Override
    public int step() throws Stopexeption {
        if(ile==-1)
        {
            ile = wyr.oblicz();
            i.zmiana(0);
            wykonanie=0;
        }
        if(ile<=0)
        {ile=-1;return 1;}
        if(b.step()==1)
        {wykonanie++;i.zmiana(wykonanie);}
        if(wykonanie==ile)
        {ile=-1;return 1;}
        return 0;
    }
}

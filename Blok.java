import java.util.*;
public class Blok extends Instrukcja{
    private Set<Zmienna> zmienne = new TreeSet<>();
    private Set<String> nazwy = new TreeSet<>();
    private Instrukcja[] instrukcje;
    private Wyrazenie[] przypisania;
    private int ktora_instrukcja = 0;
    public Blok(Zmienna[] zmienne,Wyrazenie[] przypisania,Instrukcja[] instrukcje){
        if(przypisania!=null)
        {
            this.instrukcje=new Instrukcja[przypisania.length+instrukcje.length];
            for(int i=0;i<przypisania.length;i++)
                this.instrukcje[i]=new Przypisanie(zmienne[i],przypisania[i]);
            for(int i=0;i<instrukcje.length;i++)
                this.instrukcje[i+przypisania.length]=instrukcje[i];
        }
        else
            this.instrukcje=instrukcje;
        if(zmienne==null) return;
        for (Zmienna zmienna : zmienne) {
            this.zmienne.add(zmienna);
            this.nazwy.add(zmienna.nazwa());
        }
    }

    @Override
    public int step() throws Stopexeption {
        if(instrukcje==null) return 1;
        ktora_instrukcja += instrukcje[ktora_instrukcja].step();
        if(ktora_instrukcja==instrukcje.length)
        {ktora_instrukcja=0;return 1;}
        return 0;
    }

    //@Override
    //public void printnext() {

   // }


}

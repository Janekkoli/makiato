public class Zmienna extends Wyrazenie implements Comparable<Zmienna> {
   private int wartosc;
   private String nazwa;

   public String nazwa()
   {return nazwa;}
   public int wartosc()
   {return wartosc;   }
   public Zmienna(String nazwa)
   {
      this.nazwa=nazwa;
   }
   public void zmiana(int co)
   {wartosc=co;}
   public void dod(int x)
   {wartosc+=x;}
   @Override
   public int oblicz()
   {
      return wartosc;
   }

   @Override
   public int compareTo(Zmienna o) {
      return nazwa.compareTo(o.nazwa);
   }
}

public class Main {
    public static void main(String[] args) {
         Zmienna n = new Zmienna("n");
         Zmienna k = new Zmienna("k");
         Zmienna p = new Zmienna("p");
         Zmienna i = new Zmienna("i");
         Warunek If2 = new Warunek(new Modulo(k,i),"=",new Lit(0),new Instrukcja[]{new Przypisanie(p,new Lit(0))},null);
         Petla For = new Petla(i,new Odejmowanie(k,new Lit(2)),new Instrukcja[]{new Przypisanie(i, new Dodawanie(i,new Lit(2))),If2} );
         Warunek If = new Warunek(p,"=",new Lit(1),new Instrukcja[]{new Print(k)},null);
         Blok blok2 = new Blok(new Zmienna[]{p},new Wyrazenie[]{new Lit(1)},new Instrukcja[]{new Przypisanie(k,new Dodawanie(k,new Lit(2))),For,If});
         Blok blok1 = new Blok(new Zmienna[]{n},new Wyrazenie[]{new Lit(30)},new Instrukcja[]{new Petla(k,new Odejmowanie(n,new Lit(1)),new Instrukcja[]{blok2})});
         try {
             while (blok1.step() == 0) ;
         }
         catch (Stopexeption e){
             System.out.println("Stop");
         }
    }
}
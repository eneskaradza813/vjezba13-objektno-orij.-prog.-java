package vjezba13;

public class Vjezba13 {

    public static void main(String[] args) {

      Kretanje niz[] = {
          new Pas("Max", "Bernardinac"),
          new Riba("Nemo", "riba klovn"),
          new Zaba("kermit"),
          new Kokoska("Mica", "domaca kokos"),
          new Pingvin("Tux")
      };
      
        int i = 1;
        for(Kretanje k: niz){
            System.out.println((i++) + "."+ k);
            
            // ispisiKretanja(k.kreciSe());
             
             
             if(k instanceof Oglasavanje)
                 ((Oglasavanje)k).oglasiSe();
        }
        
        
    }

}

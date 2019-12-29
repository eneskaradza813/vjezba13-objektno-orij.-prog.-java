package vjezba13;

public class Zaba implements Oglasavanje, Kretanje{

    public String ime;
    
    public Zaba(String ime){
        this.ime = ime;
        
    }
    
    public void oglasiSe(){
        System.out.println("Kre, Kre");
    }
   public int kreciSe(){
       return PLIVA;
   }
        public String toString(){
            return "zaba" + ime;
        }
    }


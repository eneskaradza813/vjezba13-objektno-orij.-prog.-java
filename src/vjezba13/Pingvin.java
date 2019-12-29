package vjezba13;

public class Pingvin implements Kretanje{
    
    private String ime;
    
    public Pingvin(String ime){
        this.ime = ime;
        
    }

    public int kreciSe(){
        return PLIVA | HODA;
    }
    public String toString(){
        return "pingvin" + ime;
    }
    
}

package vjezba13;

public class Riba implements Kretanje{

    
    public String ime, vrsta;
    
    public Riba(String ime, String vrsta){
        this.ime = ime;
        this.vrsta = vrsta;
        
    }
    
    @Override
    public int kreciSe(){
        return PLIVA;
        
    }
    @Override
    public String toString(){
        return "riba: " + ime + "," + vrsta;
    }
}

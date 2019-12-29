
package vjezba13;

public class Kokoska implements Oglasavanje, Kretanje{
    
    public String ime, rasa;
    public Kokoska(String ime, String rasa){
        this.ime = ime;
        this.rasa = rasa;
        
                
    }
    public void oglasiSe(){
        System.out.println("Kokoda");
    }
    public int kreciSe(){
        return HODA | LETI;
    }
    public String toString(){
        return "kokoska: " + ime + ", " + rasa;
    }
}

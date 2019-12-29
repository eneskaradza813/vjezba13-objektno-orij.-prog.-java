package vjezba13;

public class Pas implements Oglasavanje, Kretanje {

    private String ime, rasa;
    
    public Pas(String ime, String rasa){
        this.ime = ime;
        this.rasa = rasa;
        
    }
    @Override
    public void oglasiSe(){
        System.out.println("Av, av.");
    }
    
    @Override
    public int kreciSe(){
        return HODA;
    }
    public String toString(){
        return "pas: " + ime + "," + rasa;
    }
}

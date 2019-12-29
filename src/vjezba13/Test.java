package vjezba13;

public class Test {

    private static void ispisiKretanja(int naciniKretanja){
        if((naciniKretanja & Kretanje.HODA)==Kretanje.HODA)
            System.out.println("hoda");
        if((naciniKretanja & Kretanje.PLIVA) == Kretanje.PLIVA)
            System.out.println("Pliva");
        if((naciniKretanja & Kretanje.LETI)==Kretanje.LETI)
            System.out.println("Leti");
        System.out.println("");
    }
    
    
    
}

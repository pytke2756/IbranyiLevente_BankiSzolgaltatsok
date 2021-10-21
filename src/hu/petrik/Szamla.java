package hu.petrik;

public class Szamla extends BankiSzolgaltatas{
    private int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return this.aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        if (osszeg >= 0){
            this.aktualisEgyenleg += osszeg;
        }
        else{
            System.out.println("Hibás érték!");
        }
    }

    public boolean kivesz(int osszeg){
        if (osszeg >= 0){
            this.aktualisEgyenleg -= osszeg;
            return true;
        }
        else{
            return false;
        }
    }
}

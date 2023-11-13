public class Konto {
    private int kontoNr;
    private int saldo = 100;
    private int limite = -500;
    public Konto(int saldo, int kontoNr) {
        this.kontoNr = kontoNr;
    }
    public String einzahlen(int betrag){
        saldo = saldo + betrag;
        return "success";
    }
    public Boolean abheben(int betrag){
        if (!((saldo - betrag) < limite)){
            saldo = saldo - betrag;
            return true;
        }else {
            return false;
        }

    }
    public String ueberweisen(int betrag, Konto konto){
        if(abheben(betrag)){
            konto.einzahlen(betrag);
            return "Success";
        }else {
            return "failed";
        }
    }
    public int getKontoNr() {
        return kontoNr;
    }
    public int getSaldo() {
        return saldo;
    }
}

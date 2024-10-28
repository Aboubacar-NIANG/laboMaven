public class Monnaie {
    final long monnaie;

    //Constructeur
    public Monnaie(long monnaie) {
        this.monnaie = monnaie;
    }
    //getter
    public long getMonnaie() {
        return monnaie;
    }

    public Monnaie additionner(Monnaie autre) {
        return new Monnaie(this.monnaie + autre.monnaie);
    }

    public Monnaie pourcentage(double pourcentage) {
        return new Monnaie(Math.round(this.monnaie * pourcentage / 100));
    }

    public Monnaie soustraire(Monnaie autre) {
        return new Monnaie(this.monnaie - autre.monnaie);
    }

    @Override
    public String toString(){
        String decimales = this.monnaie % 100 < 10 ? "0" + this.monnaie % 100 : String.valueOf(this.monnaie % 100);
        return this.monnaie / 100 + "," + decimales + "$";
    }
}

public class CalculTaxes {
    public static final double TAXE_FEDERALE = 0.05;
    public static final double TAXE_PROVINCIALE = 0.09975;
    public static long calculerTaxes(long montantEnSous, boolean taxeFederale, boolean taxeProvinciale) {
        long resultat = montantEnSous;
        if (montantEnSous <= 0) {
            throw new IllegalArgumentException();
        } else {
            if (taxeFederale) {
                resultat += Math.round(montantEnSous * TAXE_FEDERALE);
            }
            if (taxeProvinciale) {
                resultat += Math.round(montantEnSous * TAXE_PROVINCIALE);
            }
        }
        return resultat;
    }
}


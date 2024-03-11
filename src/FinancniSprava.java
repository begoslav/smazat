public class FinancniSprava {
    private double zustatek;

    public FinancniSprava() {
        this.zustatek = 1000.0; // Počáteční zůstatek
    }

    public void odecistiPenize(double castka) {
        this.zustatek -= castka;
    }

    public void pridejPenize(double castka) {
        this.zustatek += castka;
    }

    public double getZustatek() {
        return zustatek;
    }
}

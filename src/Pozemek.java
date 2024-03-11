public class Pozemek {
    private double plocha;

    public Pozemek(double plocha) {
        this.plocha = plocha;
    }

    public double getPlocha() {
        return plocha;
    }

    public double getCena() {
        // Cena pozemku je závislá na jeho ploše
        return plocha * 10.0;
    }
}


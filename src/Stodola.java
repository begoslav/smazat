public class Stodola {
    private int kapacita;
    private int obsazenost;

    public Stodola() {
        this.kapacita = 20;
        this.obsazenost = 0;
    }

    public void rozsir() {
        this.kapacita += 10;
    }

    public void kupMisto(double cena) {
        if (obsazenost < kapacita) {
            obsazenost++;
        }
    }
}

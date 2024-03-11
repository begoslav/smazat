public abstract class Mrkev extends Flower{
    public Mrkev() {
        super("Mrkev", 0.5, 1.0, 0.8);
    }

    @Override
    public void zavlazit() {
        this.chanceOfGrowth += 0.2;
    }
}

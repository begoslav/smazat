public abstract class Jablko extends Flower{
    public Jablko() {
        super("Jablko", 1.0, 2.0, 0.7);
    }

    @Override
    public void zavlazit() {
        this.chanceOfGrowth += 0.1;
    }
}

public class Kralik extends Animal{
    public Kralik(String jmeno, Size velikost, String specialniPec) {
        super("Kralik", jmeno, velikost, specialniPec);
    }

    @Override
    public void pohladit() {
        System.out.println("Kralik " + name + " byl pohlažen.");
    }
}

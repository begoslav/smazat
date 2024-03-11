public class Koza extends Animal{
    public Koza(String jmeno, Size velikost, String specialniPec) {
        super("Koza", jmeno, velikost, specialniPec);
    }

    @Override
    public void pohladit() {
        System.out.println("Koza " + name + " byla pohlažena.");
    }
}

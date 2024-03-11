public class Main {
    public static void main(String[] args) {
        Farmer farmar = new Farmer();
        farmar.pridatRostlinu(new Jablko());
        farmar.pridatRostlinu(new Mrkev());
        farmar.pridatRostlinu(new Jablko());
        farmar.pridatZvire(new Koza("Berta", Size.BIG, "žádná"));
        farmar.pridatZvire(new Kralik("Hopík", Size.SMALL, "žádná"));

        farmar.nakupPozemek(1000.0, 10.0);
        farmar.prodejPozemek(new Pozemek(5.0));

        farmar.rozsirStodolu();
        farmar.kupMistoVeStodole(500.0);
        //heheheha
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farmer implements SpravaZvirat, SpravaRostlin, SpravaFinanci, SpravaMajetku{
    private List<Flower> rostliny;
    private List<Animal> zvirata;
    private FinancniSprava financniSprava;
    private List<Pozemek> pozemky;
    private Stodola stodola;

    public Farmer() {
        this.rostliny = new ArrayList<>();
        this.zvirata = new ArrayList<>();
        this.financniSprava = new FinancniSprava();
        this.pozemky = new ArrayList<>();
        this.stodola = new Stodola();
    }
    @Override
    public void pridatZvire(Animal zvire) {
        if (zvirata.size() < 20) {
            zvirata.add(zvire);
            System.out.println("Zvíře " + zvire.name + " bylo přidáno.");
        } else {
            System.out.println("Stodola je plná, nelze přidat další zvíře.");
        }
    }

    @Override
    public void odebratZvire(Animal zvire) {
        zvirata.remove(zvire);
        System.out.println("Zvíře " + zvire.name + " bylo odebráno.");
    }

    // Metody pro správu rostlin
    @Override
    public void pridatRostlinu(Flower rostlina) {
        if (rostliny.size() < 5) {
            rostliny.add(rostlina);
            System.out.println("Rostlina " + rostlina.name + " byla přidána.");
        } else {
            System.out.println("Na pozemku je již pěstováno maximální množství rostlin.");
        }
    }

    @Override
    public void odebratRostlinu(Flower rostlina) {
        rostliny.remove(rostlina);
        System.out.println("Rostlina " + rostlina.name + " byla odebrána.");
    }

    // Metody pro správu financí
    @Override
    public void nakupPozemek(double cena, double plocha) {
        if (financniSprava.getZustatek() >= cena) {
            financniSprava.odecistiPenize(cena);
            Pozemek novyPozemek = new Pozemek(plocha);
            pozemky.add(novyPozemek);
            System.out.println("Pozemek o rozloze " + plocha + "ha byl zakoupen.");
        } else {
            System.out.println("Nedostatek finančních prostředků na nákup pozemku.");
        }
    }

    @Override
    public void prodejPozemek(Pozemek pozemek) {
        financniSprava.pridejPenize(pozemek.getCena());
        pozemky.remove(pozemek);
        System.out.println("Pozemek byl prodán za " + pozemek.getCena() + ".");
    }

    // Metody pro správu majetku
    @Override
    public void rozsirStodolu() {
        stodola.rozsir();
        System.out.println("Stodola byla rozšířena.");
    }

    @Override
    public void kupMistoVeStodole(double cena) {
        stodola.kupMisto(cena);
        financniSprava.odecistiPenize(cena);
        System.out.println("Místo ve stodole bylo zakoupeno za " + cena + ".");
    }
}


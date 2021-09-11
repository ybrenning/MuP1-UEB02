package Personalverwaltung;

public class Main {
    public static void main(String[] args) {
        Verwaltung verwaltung = new Verwaltung(20);

        Angestellter angestellter1 = new Angestellter("Kevin", 30000);
        Angestellter angestellter2 = new Angestellter("Josephine", 100000);
        Angestellter angestellter3 = new Angestellter("Jonas", 9000);
        Angestellter angestellter4 = new Angestellter("Stefanie", 12000);

        Arbeiter arbeiter1 = new Arbeiter("Olaf", 12, 40);
        Arbeiter arbeiter2 = new Arbeiter("Tanja", 15, 30);
        Arbeiter arbeiter3 = new Arbeiter("Ulf", 20, 8);
        Arbeiter arbeiter4 = new Arbeiter("Jennifer", 40, 5);

        verwaltung.addMitarbeiter(angestellter1);
        verwaltung.addMitarbeiter(angestellter2);
        verwaltung.addMitarbeiter(angestellter3);
        verwaltung.addMitarbeiter(angestellter4);
        verwaltung.addMitarbeiter(arbeiter1);
        verwaltung.addMitarbeiter(arbeiter2);
        verwaltung.addMitarbeiter(arbeiter3);
        verwaltung.addMitarbeiter(arbeiter4);

        System.out.println("Personalkosten: " + verwaltung.berechnePersonalkosten());

        verwaltung.removeMitarbeiter(arbeiter1);

        System.out.println("Personalkosten: " + verwaltung.berechnePersonalkosten());

        verwaltung.zeigeMitarbeiterMitWenigerAlsXStunden(10);
    }
}

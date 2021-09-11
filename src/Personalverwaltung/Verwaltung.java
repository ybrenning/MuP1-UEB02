package Personalverwaltung;

public class Verwaltung {
    private Mitarbeiter[] mitarbeiter;

    public Verwaltung(int anzahlMitarbeiter) {
        this.mitarbeiter = new Mitarbeiter[anzahlMitarbeiter];
    }

    public boolean addMitarbeiter(Mitarbeiter mitarbeiter) {
        for (int i = 0; i < this.mitarbeiter.length; i++) {
            if (this.mitarbeiter[i] == null) {
                this.mitarbeiter[i] = mitarbeiter;
                return true;
            }
        }

        return false;
    }

    public boolean removeMitarbeiter(Mitarbeiter mitarbeiter) {
        for (int i = 0; i < this.mitarbeiter.length; i++) {
            if (this.mitarbeiter[i].equals(mitarbeiter)) {
                this.mitarbeiter[i] = null;
                return true;
            }
        }

        return false;
    }

    public double berechnePersonalkosten() {
        double personalkosten = 0;
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] == null) {
                continue;
            }

            personalkosten += mitarbeiter[i].berechneVerdienst();
        }

        return personalkosten;
    }

    public void zeigeMitarbeiterMitWenigerAlsXStunden(double stunden) {
        System.out.println("Arbeiter mit weniger als " + stunden + " Stunden:");
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] instanceof Arbeiter) {
                if (((Arbeiter) mitarbeiter[i]).getGeleisteteStunden() < stunden) {
                    System.out.print(mitarbeiter[i].getName() + " Stundenlohn: "
                    + ((Arbeiter) mitarbeiter[i]).getStundenlohn() + " Euro geleistete Stunden: "
                    + ((Arbeiter) mitarbeiter[i]).getGeleisteteStunden() + " Stunden\n");
                }
            }
        }
    }

    public Mitarbeiter[] getMitarbeiter() {
        return mitarbeiter;
    }
}

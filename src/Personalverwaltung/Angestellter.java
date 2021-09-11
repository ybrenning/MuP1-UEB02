package Personalverwaltung;

public class Angestellter extends Mitarbeiter{
    private double gehalt;

    public Angestellter(String name, double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    @Override
    public double berechneVerdienst() {
        return gehalt;
    }

    @Override
    public String toString() {
        return this.getName() + " Gehalt:" + String.format("%.2f", gehalt);
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}

package Personalverwaltung;

public class Arbeiter extends Mitarbeiter{
    private double stundenlohn;
    private double geleisteteStunden;


    public Arbeiter(String name, double stundenlohn, double geleisteteStunden) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.geleisteteStunden = geleisteteStunden;
    }

    @Override
    public double berechneVerdienst() {
        return stundenlohn * geleisteteStunden;
    }

    @Override
    public String toString() {
        return this.getName() + " Stundenlohn: " + String.format("%.2f", stundenlohn)
                + " geleistete Stunden: " + String.format("%.1f", geleisteteStunden);
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getGeleisteteStunden() {
        return geleisteteStunden;
    }

    public void setGeleisteteStunden(double geleisteteStunden) {
        this.geleisteteStunden = geleisteteStunden;
    }
}

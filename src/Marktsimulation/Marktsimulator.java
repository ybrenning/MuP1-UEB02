package Marktsimulation;

/**
 * @author Yannick Brenning
 * @version 1.0.0, 05.09.2021
 * <p> Ein Objekt vom Typ <code> Marktsimulation.Marktsimulator </code> enthaelt
 * eine Liste an Objekten vom Typ <code> Marktsimulation.Marktanteil </code>, welche
 * die Marktanteile fuer einzelne Tage enthalten.
 */
public class Marktsimulator {
    private final Marktanteil[] tagesMarktanteil;
    private final double bleibBeiA;
    private final double bleibBeiB;

    /**
     * @param start Ausgangspunkt der Simulation
     * @param tage Menge an Tage, die die Simulation berechnen soll
     * @param bleibBeiA Wahrscheinlichkeit, dass ein Kunde bei Produkt A bleibt
     * @param bleibBeiB Wahrscheinlichkeit, dass ein Kunde bei Produkt B bleibt
     */
    public Marktsimulator(Marktanteil start, int tage, double bleibBeiA, double bleibBeiB) {
        this.tagesMarktanteil = new Marktanteil[tage];
        tagesMarktanteil[0] = start;

        this.bleibBeiA = bleibBeiA;
        this.bleibBeiB = bleibBeiB;
        simuliere();
    }

    /**
     * Die Methode <code> simuliere </code> wird die Marktanteile fuer jeden Tag
     * anhand der Methode <code> naechsterTag </code> berechnen, und damit
     * die Liste an tagesMarktanteilen fuellen.
     */
    public void simuliere() {
        for (int i = 1; i < this.tagesMarktanteil.length; i++) {
            this.tagesMarktanteil[i] = this.tagesMarktanteil[i - 1]
                    .naechsterTag(this.bleibBeiA, this.bleibBeiB);
        }
    }

    /**
     * Die Methode <code> zeigeMarktverlauf </code> gibt den gesamten Marktverlauf
     * sowie alle zugehoerigen Daten mithilfe der Methode <code> toString </code> aus.
     */
    public void zeigeMarktverlauf() {
        System.out.println("Marktentwicklung:");

        System.out.print("Produkt A:");
        for (int i = 0; i < this.tagesMarktanteil.length; i++) {
            System.out.print(" " + this.tagesMarktanteil[i].getKaeuferVonA());
        }

        System.out.print("\nProdukt B:");
        for (int j = 0; j < this.tagesMarktanteil.length; j++) {
            System.out.print(" " + this.tagesMarktanteil[j].getKaeuferVonB());
        }

        System.out.println("\nFinale Marktaufteilung:\n"
                + this.tagesMarktanteil[this.tagesMarktanteil.length - 1].toString());
    }
}

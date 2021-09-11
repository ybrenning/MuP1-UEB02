package Marktsimulation;

/**
 * @author Yannick Brenning
 * @version 1.0.0, 05.09.2021
 * <p> Ein Objekt vom Typ <code> Marktsimulation.Marktanteil </code>
 * enthaelt die Menge der Kaeufer zweier Produkte.</p>
 */

public class Marktanteil {
    private final int kaeuferVonA;
    private final int kaeuferVonB;

    /**
     * @param kaeuferVonA Menge der Kaeufer eines Produkts A
     * @param kaeuferVonB Menge der Kaeufer eines Produkts B
     */
    public Marktanteil(int kaeuferVonA, int kaeuferVonB) {
        this.kaeuferVonA = kaeuferVonA;
        this.kaeuferVonB = kaeuferVonB;
    }

    /**
     * Die Methode <code> naechsterTag </code> bestimmt
     * anhand zweier als Parameter uebergebener Wahrscheinlichkeiten
     * die neuen Marktanteile vom naechsten Tag.
     * @param bleibBeiA Wahrscheinlichkeit, dass ein Kunde bei Produkt A bleibt
     * @param bleibBeiB Wahrscheinlichkeit, dass ein Kunde bei Produkt B bleibt
     * @return Objekt vom Typ <code> Marktsimulation.Marktanteil </code>
     */
    public Marktanteil naechsterTag(double bleibBeiA, double bleibBeiB) {
        double rand;
        int kaeuferVonA = getKaeuferVonA();
        int kaeuferVonB = getKaeuferVonB();

        for (int i = 0; i < kaeuferVonA; i++) {
            rand = Math.random();
            if (rand > bleibBeiA) {
                kaeuferVonA--;
                kaeuferVonB++;
            }
        }

        for (int j = 0; j < kaeuferVonB; j++) {
            rand = Math.random();
            if ( rand > bleibBeiB) {
                kaeuferVonB--;
                kaeuferVonA++;
            }
        }

        return new Marktanteil(kaeuferVonA, kaeuferVonB);
    }

    /**
     * Die Methode <code> toString </code> gibt die Kaeuferzahlen beider
     * Produkte eines Objekts vom Typ <code> Marktsimulation.Marktanteil </code> sowie
     * die Marktanteile in Prozent (gerundet) als String zurueck.
     * @return String, welcher die formatierten Marktanteildaten enthaelt
     */
    public String toString() {
        double ges = this.kaeuferVonA + this.kaeuferVonB;
        double prozentA = Math.round((this.kaeuferVonA / ges * 100));
        double prozentB = Math.round((this.kaeuferVonB / ges * 100));

        return ("Marktanteil Käufer Produkt A: " + this.kaeuferVonA + " ("
                + (int)prozentA + "%)" + " Käufer Produkt B: " + this.kaeuferVonB + " ("
                + (int)prozentB + "%)");
    }

    public int getKaeuferVonA() {
        return kaeuferVonA;
    }

    public int getKaeuferVonB() {
        return kaeuferVonB;
    }
}

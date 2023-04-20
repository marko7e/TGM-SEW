package Rest;

/**
 * Diese Klasse beinhaltet Methoden, um ein virtuelles Schwimmbecken zu erzeugen
 * @author Marko Ekmedzic
 * @version 2022-11-24
 */
public class Schwimmbecken {
    private int laenge, breite, hoehe;
    private double wasserMenge;

    /**
     * Konstruktor für die Klasse
     * @param laenge fdsf
     * @param breite sadda
     * @param hoehe fbdhf
     */
    public Schwimmbecken(int laenge, int breite, int hoehe) {
        this.wasserMenge = 0;
        if(laenge < 0 ) {
            laenge = 100;
        }
        if(breite < 0) {
            breite = 100;
        }
        if(hoehe < 0) {
            hoehe = 100;
        }
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    /**
     * dbhfmsdjhff
     * @return cbsfbisdf
     */
    public int getLaenge() {
        return this.laenge;
    }

    /**
     * fsduifhdsfkf
     * @return hsdfkjskfb
     */
    public int getBreite() {
        return this.breite;
    }

    /**
     * higfdsoxdf
     * @return hisdfhlksdf
     */
    public int getHoehe() {
        return this.hoehe;
    }

    /**
     * nfksdfnoslf
     * @param wasserMenge hbfjkdsfbksdf
     */
    public void setWasserMenge(double wasserMenge) {
        if(wasserMenge >= 0 && this.volumen() >= wasserMenge) {
            this.wasserMenge = wasserMenge;
        }
    }

    /**
     * fnsdkflsdf
     * @return fhbdskjfsf
     */
    public double getWasserMenge() {

        return this.wasserMenge;
    }

    /**
     * fhkdfksdfdsf
     * @return fdbjfksdf
     */
    public double volumen() {
        return (double) this.laenge * this.breite * this.hoehe / 1000;
    }

    /**
     * fjdklff
     * @param liter bkjdfsdf
     * @return hufkasdfok
     */
    public boolean einfuellen(double liter) {
        if (!(liter + this.wasserMenge <= volumen())) {
            return false;
        }
        this.wasserMenge += liter;
        return true;
    }

    /**
     * sbdfjsadff
     * @param liter fckisdfi
     * @return nfkdsfj
     */
    public boolean auslassen(double liter) {
        if(wasserMenge-liter < 0) {
            return false;
        }
        this.wasserMenge -= liter;
        return true;
    }

    /**
     * fhisdofsdfdfs
     * @return bcdkdslcfd
     */
    public double leeren() {
       return wasserMenge = 0;
    }

    /**
     * bjsmcsfc
     * @return bjksadfidf
     */
    public String status () {
        return "Schwimmbecken: " + this.laenge + "cm x " + this.breite + "cm x " + this.hoehe + "cm\n(Fassungsvermögen: " + volumen() + " Liter) - Momentane Wassermenge: "
                + this.wasserMenge + " Liter.";
    }
}

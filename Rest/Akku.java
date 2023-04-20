package Rest;

public class Akku extends Batterie implements IstAufladbar {
    private String bezeichnung = "";
    private double kapazitaet = 0.0;
    private double maxKapazitaet = 0.0;

    public Akku(String bezeichnung, double maxKapazitaet) {
        super(bezeichnung, maxKapazitaet);
        this.maxKapazitaet = maxKapazitaet;
    }
    /**
     * Die Methode aufladen lädt den Akku auf die angegebenen Prozent der Maximalkapazität
     * auf (d.h. wenn die Maximalkapazität 2 Ah ist und der Akku derzeit 0,5 Ah aufweist, dann
     * hat der Akku nach dem Aufruf von aufladen(80) eine Kapazität von 1,6 Ah).
     * @param prozent Prozentanzahl
     */
    @Override
    public void aufladen(double prozent) {
        if(prozent > 100 && prozent < 0) {
            throw new IllegalArgumentException("Falsch");
        }
        double geladen = maxKapazitaet * prozent/100;
        setKapazitaet(geladen);
    }

    public void setMaxKapazitaet(double maxKapazitaet) {
        if(getMaxKapazitaet() > maxKapazitaet) {
            throw new IllegalArgumentException("Kapazität zu hoch!");
        }
        this.maxKapazitaet = maxKapazitaet;
    }
    public double getMaxKapazitaet() {
        return maxKapazitaet;
    }

    public double ladestand() {
        return kapazitaet/getMaxKapazitaet()*100;
    }
    @Override
    public String info() {
        return super.info() + " - " + ladestand() + "% von " + getMaxKapazitaet() + " Ah";
    }


}

package ArraysMitObjekten;

public class Musikstueck {
    private String titel;
    private String interpret;
    private int laenge;

    public Musikstueck() {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    public Musikstueck(String titel, String interpret, int laenge) {
        this.setTitel(titel);
        this.setInterpret(interpret);
        this.setLaenge(laenge);
    }

    public String zeigeDauer() {
        int minuten = this.laenge / 60;
        int sekunden = this.laenge % 60;
        return minuten + ":" + sekunden;
    }

    public String zeigeDaten() {
        return "Titel: " + this.titel + " Interpret: " + this.interpret + " Länge: " + zeigeDauer();
    }

    public void setTitel(String titel) {
        if(titel == null || titel.isEmpty())
            throw new IllegalArgumentException("Der String darf nicht leer sein!");
        this.titel = titel;
    }
    public String getTitel(){
        return this.titel;
    }

    public void setInterpret(String interpret) {
        if(interpret == null || interpret.isEmpty())
            throw new IllegalArgumentException("Der Interpret darf nicht leer sein!");
        this.interpret = interpret;
    }
    public String getInterpret() {
        return this.interpret;
    }

    public void setLaenge(int laenge) {
        if(!(laenge >= 0))
            throw new IllegalArgumentException("Die Länge darf nicht unter 0 sein!");
        this.laenge = laenge;
    }
    public int getLaenge() {
        return laenge;
    }
}

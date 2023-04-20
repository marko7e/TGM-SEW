package ArraysMitObjekten;
public class Musikalbum {
    private String albumName;
    private String albumInterpret;
    private Musikstueck[] musikstuecke;

    public Musikalbum(String albumName, String albumInterpret, int anzahlMusikstuecke) {
        this.setAlbumName(albumName);
        this.setAlbumInterpret(albumInterpret);
        this.musikstuecke = new Musikstueck[anzahlMusikstuecke];
    }

    public String getAlbumName() {
        return this.albumName;
    }
    public void setAlbumName(String albumName) {
        if (albumName == null || albumName.isEmpty())
            throw new IllegalArgumentException("Der Albumname darf nicht leer sein!");
        this.albumName = albumName;
    }

    public String getAlbumInterpret() {
        return this.albumInterpret;
    }
    public void setAlbumInterpret(String albumInterpret) {
        if (albumInterpret == null || albumInterpret.isEmpty())
            throw new IllegalArgumentException("Der Albuminterpret darf nicht leer sein!");
        this.albumInterpret = albumInterpret;
    }

    public Musikstueck[] getMusikstueck() {
        return this.musikstuecke;
    }
    public void setMusikstueck(Musikstueck musikstuecke) {
        for (int i = 0; i < this.musikstuecke.length; i++) {
            if (this.musikstuecke[i] == null) {
                this.musikstuecke[i] = musikstuecke;
            }
        }
    }
    public boolean addMusikstueck(Musikstueck musikstueck) {
        for (int i = 0; i < this.musikstuecke.length; i++) {
            if (this.musikstuecke[i] == null) {
                this.musikstuecke[i] = musikstueck;
                return true;
            }
        }
        return false;
    }

    public boolean addMusikstueck(String titel, String interpret, int dauer) {
        Musikstueck musikstueck = new Musikstueck(titel, interpret, dauer);
        for (int i = 0; i < this.musikstuecke.length; i++) {
            if (this.musikstuecke[i] == null) {
                this.musikstuecke[i] = musikstueck;
                return true;
            }
        }
        return false;
    }

    public String listMusikstuecke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Musikstücke in Album " + this.albumName + ":\n");
        for (int i = 0; i < this.musikstuecke.length; i++) {
            if (this.musikstuecke[i] != null) {
                sb.append((i + 1) + ". " + this.musikstuecke[i].getTitel() + " von " + this.musikstuecke[i].getInterpret() + " (" + this.musikstuecke[i].zeigeDauer() + ")\n");
            }
        }
        return sb.toString();
    }

    public boolean removeMusikstueck(int weg) {
        if (weg < 1 || weg > this.musikstuecke.length) {
            return false;
        }
        this.musikstuecke[weg - 1] = null;
        return true;
    }

    public String zeigeDauer() {
        int gesamtdauer = 0;
        for (Musikstueck musikstueck : this.musikstuecke) {
            if (musikstueck != null) {
                gesamtdauer += musikstueck.getLaenge();
            }
        }
        int minuten = gesamtdauer / 60;
        int sekunden = gesamtdauer % 60;
        return minuten + ":" + sekunden;
    }
}

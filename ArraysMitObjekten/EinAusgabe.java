package ArraysMitObjekten;

public class EinAusgabe {
    public static void main(String[] args) {
    Musikstueck musikstueck1 = new Musikstueck("Titel 1", "Interpret 1", 180);
    Musikstueck musikstueck2 = new Musikstueck("Titel 2", "Interpret 2", 240);
    Musikstueck musikstueck3 = new Musikstueck("Titel 3", "Interpret 3", 300);

    // Erstelle ein Musikalbum mit Platz für 3 Musikstücke
    Musikalbum album = new Musikalbum("Albumname", "Albuminterpret", (byte) 3);

    // Füge die Musikstücke dem Album hinzu
        album.addMusikstueck(musikstueck1);
        album.addMusikstueck(musikstueck2);
        album.addMusikstueck(musikstueck3);

    // Teste die Methoden der Klasse Musikalbum
        System.out.println(album.getAlbumName());
        System.out.println(album.getAlbumInterpret());
    Musikstueck[] musikstuecke = album.getMusikstueck();
        for (Musikstueck musikstueck : musikstuecke) {
        System.out.println(musikstueck.zeigeDaten());
    }

    // Teste die Methoden der Klasse Musikstueck
        System.out.println(musikstueck1.getTitel());
        System.out.println(musikstueck1.getInterpret());
        System.out.println(musikstueck1.getLaenge());
        System.out.println(musikstueck1.zeigeDauer());
    }
}

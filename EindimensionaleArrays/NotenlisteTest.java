package EindimensionaleArrays;

/**
 * Diese Klasse testet Methonden von Notenliste.java
 * @author Marko Ekmedzic
 * @version 2022-12-13
 */
public class NotenlisteTest {
    /**
     * Main-Methode
     * @param args String array
     */
    public static void main(String[] args) {
        Notenliste n1 = new Notenliste(19);
        Notenliste n2 = new Notenliste(3);

        //Methode Notenliste.checkNote testen
        //NF Zahl zwischen 1 und 5
        System.out.println(Notenliste.checkNote(1));
        System.out.println(Notenliste.checkNote(3));
        //GF 5-6
        System.out.println(Notenliste.checkNote(5));
        System.out.println(Notenliste.checkNote(6));
        //FF alles über 5, chars und Strings
        System.out.println(Notenliste.checkNote(19));
        System.out.println(Notenliste.checkNote('c'));

        System.out.println("--------------------------------------");

        //Methode addnote() testen
        //NF Zahl zwischen 1 und 5
        System.out.println(n1.addNote(1));
        System.out.println(n1.addNote(4));
        //GF
        System.out.println(n1.addNote(5));
        System.out.println(n1.addNote(6));
        // FF
        System.out.println(n1.addNote(19));
        System.out.println(n1.addNote('c'));

        System.out.println(n1.notenliste());

        System.out.println("--------------------------------------");

        //Methode deletenote() testen
        //NF Zahl zwischen 0 bis 2
        System.out.println(n1.deleteNote(0));
        System.out.println(n1.deleteNote(1));
        //GF 3 bis 19
        System.out.println(n1.deleteNote(18));
        System.out.println(n1.deleteNote(19));
        //FF alles über 18, chars und Strings
        System.out.println(n1.deleteNote(99));
        System.out.println(n1.deleteNote('c'));

        System.out.println(n1.notenliste());

        System.out.println("--------------------------------------");

        //Methode setnote() testen
        //NF Zahl zwischen 0 bis 2
        System.out.println(n2.setNote(4, 0));
        System.out.println(n2.setNote(2, 1));
        //GF 2-3
        System.out.println(n2.setNote(5, 2));
        System.out.println(n2.setNote(5, 3));
        //FF alles über 2, chars, Strings
        System.out.println(n2.setNote(1, 99));
        System.out.println(n2.setNote(5, 'c'));

        System.out.println(n2.notenliste());
    }
}

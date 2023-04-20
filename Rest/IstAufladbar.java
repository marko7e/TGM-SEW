package Rest;

public interface IstAufladbar {
    /**
     * Die Methode aufladen lädt den Akku auf die angegebenen Prozent der Maximalkapazität
     * auf (d.h. wenn die Maximalkapazität 2 Ah ist und der Akku derzeit 0,5 Ah aufweist, dann
     * hat der Akku nach dem Aufruf von aufladen(80) eine Kapazität von 1,6 Ah).
     * @param prozent Prozentanzahl
     */
    public void aufladen(double prozent);


}

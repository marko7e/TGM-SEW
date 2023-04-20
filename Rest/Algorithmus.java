package Rest;

public class Algorithmus {
    public String suchen (int[]a, int s) {
        int n = a.length;
        boolean sucheErfolgreich = false;
        int i = 0;
        for(; i < n && !sucheErfolgreich; i++) {
            if(a[i] == s) {
                sucheErfolgreich = true;
                break;
            }
        }
        if(sucheErfolgreich) {
            return "" + i;
        } else {
            return "Suche nicht erfolgreich";
        }
    }

}

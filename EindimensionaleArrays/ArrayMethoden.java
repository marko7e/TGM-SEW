package EindimensionaleArrays;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Dsbdjahddas
 * @author Marko
 * @version 2022-11-30
 */
public class ArrayMethoden {
    /**
     * hsdkfhbsdkfdf
     * @param anzahl fsdbjfkdsf
     * @return sdhbkjfhosif
     */
    public static int[] zufallsArray(int anzahl) {
        int[] array = new int[anzahl];
        for(int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(anzahl*2);
        }
        return array;
    }

    /**
     * hsxjbsdioff
     * @param zahlText gkfkjdsfsf
     * @return sadhkifhsdf
     */
    public static String arrayToText(int[] zahlText) {
        String text = "";
        for(int i = 0; i < zahlText.length; i++) {
            text += zahlText[i];

            if(i < zahlText.length-1)
                text += ",";
        }
        return text;
    }

    public static int[] fillArray(int[] zahl, int zahl2) {
        for(int i = 0; i < zahl.length; i++ ) {
            zahl[i] = zahl2;
        }
        return zahl;
    }

    public static int[] fillZufallArray(int[] zahl, int von, int bis) {
        for(int i = 0; i < zahl.length; i++) {
            zahl[i] = new Random().nextInt(bis)+von;
        }
        return zahl;
    }

    public static int[] vertausche(int[] zahl, int index, int index2) {
        if(index < zahl.length && index >= 0) {
            zahl[index] = (zahl[index] + zahl[index2]) - (zahl[index2] = zahl[index2]);
        }
        return zahl;
    }
}
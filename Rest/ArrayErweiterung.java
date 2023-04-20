package Rest;

public class ArrayErweiterung {
    private int[] myArray;
    public ArrayErweiterung() {
        myArray = new int[0];
    }
    public void append(int zahl) {
        int[] temp = new int[this.myArray.length + 1];
        System.arraycopy(this.myArray, 0, temp, 0, this.myArray.length);
        temp[temp.length - 1] = zahl;
        this.myArray = temp;
    }
    public void delete(int index) {
        int[] temp = new int[this.myArray.length - 1];
        if (index < this.myArray.length && index >= 0) {
            boolean deleted = false;
            int zaehler = 0;
            for (int i = 0; i < temp.length; i++) {
                if (i != index && zaehler < 1) {
                    myArray[i] = temp[i];
                }
            }
        }
    }
        public void writeToConsole() {
            System.out.println("ARRAY AUSGABE");
            for (int i = 0; i < this.myArray.length; i++) {
                System.out.println("Index: " + i + " Element: " + myArray[i]);
            }
        }
    }


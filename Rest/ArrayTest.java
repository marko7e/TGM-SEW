package Rest;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayErweiterung meinArray = new ArrayErweiterung();
        meinArray.append(2);
        meinArray.writeToConsole();
        meinArray.delete(0);
        meinArray.writeToConsole();
    }
}

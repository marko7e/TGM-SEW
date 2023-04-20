package GrundlagenDerVererbung;
public class NumericRangeExceptionEkmedzic extends Exception {
        public NumericRangeExceptionEkmedzic() {
            super("Ihre Eingabe ist ungültig, bitte nur gültige Werte eingeben!");
        }
        public NumericRangeExceptionEkmedzic(String text) {
            super(text);
        }
}

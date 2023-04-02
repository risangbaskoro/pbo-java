/**
 * Risang Tri Baskoro
 * 24060119130119
 * 2023
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka tersebut karena angka sial!");
    }

    public AngkaSialException(String message) {
        super(message);
    }
}

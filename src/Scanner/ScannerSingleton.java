package Scanner;
import java.util.Scanner;

public class ScannerSingleton { 
    private Scanner sc;

    public Scanner getScanner() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
        return sc;
    }
}

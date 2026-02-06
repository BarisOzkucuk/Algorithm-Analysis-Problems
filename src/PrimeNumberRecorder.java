import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrimeNumberRecorder {

    public static void asalSayilariDosyayaYaz() {
        Scanner scanner = new Scanner(System.in);
        int asalSayaci = 0;
        final int HEDEF_ASAL_ADEDI = 30;

        try (PrintWriter out = new PrintWriter(new FileWriter("ASAL.txt"))) {
            System.out.println("Lütfen sayıları giriniz (30 asal sayı olana kadar devam eder):");

            while (asalSayaci < HEDEF_ASAL_ADEDI) {
                if (scanner.hasNextInt()) {
                    int sayi = scanner.nextInt();

                    if (isAsal(sayi)) {
                        out.println(sayi);
                        asalSayaci++;
                        System.out.println(asalSayaci + ". asal bulundu: " + sayi);
                    }
                } else {
                    scanner.next();
                }
            }
            System.out.println("30 asal sayıya ulaşıldı. ASAL.txt dosyası hazır.");

        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }

    private static boolean isAsal(int sayi) {
        if (sayi <= 1) return false;
        if (sayi == 2) return true;
        if (sayi % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(sayi); i += 2) {
            if (sayi % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        asalSayilariDosyayaYaz();
    }
}

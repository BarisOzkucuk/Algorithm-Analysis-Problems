import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockMarketAnalyzer {

    // Sınavda istenen METOT
    public static void stokIzle(String dosyaAdi) {
        try {
            File file = new File(dosyaAdi);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length < 2) continue;

                String symbol = parts[0];
                double startPrice = Double.parseDouble(parts[1]);

                double currentPrice = startPrice;
                int days = 0;

                for (int i = 2; i < parts.length; i++) {
                    double change = Double.parseDouble(parts[i]);
                    currentPrice += change;
                    days++;
                }

                System.out.printf("%s %.2f TL ile başladı ve %d gün sonra %.2f TL fiyat ile bitirdi.\n", 
                                  symbol, startPrice, days, currentPrice);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Hata: Dosya bulunamadı -> " + dosyaAdi);
        }
    }

    public static void main(String[] args) {
        stokIzle("stocks.txt");
    }
}

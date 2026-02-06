import java.util.Scanner;
import java.io.*;

public class DataSplitter {

    public static void main(String[] args) throws IOException {
        // Test icin ornek kullanim
        try {
            dosyaAyristir("girdi.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi hatasi.");
        }
    }

    public static void dosyaAyristir(String kaynakDosya) throws IOException {
        Scanner okuyucu = new Scanner(new File(kaynakDosya));
        
        PrintWriter sayiYazici = new PrintWriter(new FileWriter("sayi.txt"));
        PrintWriter kelimeYazici = new PrintWriter(new FileWriter("kelime.txt"));

        while (okuyucu.hasNext()) {
            if (okuyucu.hasNextInt()) {
                int sayi = okuyucu.nextInt();
                sayiYazici.println(sayi);
            } 
            else {
                String kelime = okuyucu.next();
                kelimeYazici.println(kelime);
            }
        }

        okuyucu.close();
        sayiYazici.close();
        kelimeYazici.close();
    }
}

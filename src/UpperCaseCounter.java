public class UpperCaseCounter {

    // Sınavda istenen METOT kısmı burası:
    public static int countUpperCase(String str) {
        // 1. Adım: Null kontrolü (Profesyonel kodlama için şart)
        if (str == null) {
            return 0;
        }

        int count = 0; // Büyük harf sayacımız

        // 2. Adım: String üzerinde döngü (Time Complexity: O(n))
        for (int i = 0; i < str.length(); i++) {
            
            // O anki karakteri alıyoruz
            char ch = str.charAt(i);

            // 3. Adım: ASCII mantığı ile kontrol
            // Karakter 'A' ile 'Z' arasında mı?
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count;
    }

    // Test etmek için Main metodu (Bunu GitHub için ekliyoruz)
    public static void main(String[] args) {
        String testInput = "Firat Universitesi Bilgisayar Muhendisligi";
        
        System.out.println("Analiz edilen metin: " + testInput);
        int result = countUpperCase(testInput);
        
        System.out.println("Bulunan Büyük Harf Sayısı: " + result);
        // Beklenen çıktı: F, U, B, M -> Toplam 4 olmalı.
    }
}

public class UpperCaseCounter {

    
    public static int countUpperCase(String str) {
        
        if (str == null) {
            return 0;
        }

        int count = 0; 

        /
        for (int i = 0; i < str.length(); i++) {
            
            
            char ch = str.charAt(i);

            
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count;
    }

   
    public static void main(String[] args) {
        String testInput = "Firat Universitesi Bilgisayar Muhendisligi";
        
        System.out.println("Analiz edilen metin: " + testInput);
        int result = countUpperCase(testInput);
        
        System.out.println("Bulunan Büyük Harf Sayısı: " + result);
        
    }
}

import java.util.Scanner;

public class DersGecmeDurumunuKontrolEdenProgram {
    public static void main(String[] args) {
        double turkceNotu, matNotu, fenNotu, sosyalNotu, ingilizceNotu;
        String turkce, mat, fen, sosyal, ingilizce;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Türkçe notunuzu giriniz:");
        turkceNotu = scanner.nextInt();
        if(turkceNotu < 0 || turkceNotu > 100){
            System.out.println("Hatalı not girdiniz lütfen düzeltiniz!");
            return ;
        }
        turkce = ( turkceNotu < 55) ? "Başarısız!" : "Başarılı";
        System.out.println("Türkçe dersi geçme durumu: " + turkce);

        System.out.println("Matematik notunuzu giriniz:");
        matNotu = scanner.nextInt();
        if(matNotu < 0 || matNotu > 100){
            System.out.println("Hatalı not girdiniz lütfen düzeltiniz!");
            return ;
        }
        mat = ( matNotu < 55) ? "Başarısız!" : "Başarılı!";
        System.out.println("Matematik dersi geçme durumu: " + mat);

        System.out.println("Fen Bilimleri notunuzu giriniz:");
        fenNotu = scanner.nextInt();
        if(fenNotu < 0 || fenNotu > 100){
            System.out.println("Hatalı not girdiniz lütfen düzeltiniz!");
            return ;
        }
        fen = ( fenNotu < 55) ? "Başarısız!" : "Başarılı!";
        System.out.println("Fen Bilimleri dersi geçme durumu: " + fen);

        System.out.println("Sosyal Bilimler notunuzu giriniz:");
        sosyalNotu = scanner.nextInt();
        if(sosyalNotu < 0 || sosyalNotu > 100){
            System.out.println("Hatalı not girdiniz lütfen düzeltiniz!");
            return ;
        }
        sosyal = ( sosyalNotu < 55) ? "Başarısız!" : "Başarılı!";
        System.out.println("Sosyal Bilimler dersi geçme durumu: " + sosyal);

        System.out.println("İngilizce notunuzu giriniz:");
        ingilizceNotu = scanner.nextInt();
        if(ingilizceNotu < 0 || ingilizceNotu > 100){
            System.out.println("Hatalı not girdiniz lütfen düzeltiniz!");
            return ;
        }
        ingilizce = ( ingilizceNotu < 55) ? "Başarısız!" : "Başarılı!";
        System.out.println("İngilizce dersi geçme durumu: " + ingilizce);

        double toplam = ( turkceNotu + matNotu + fenNotu + sosyalNotu + ingilizceNotu);
        double ortalama = toplam / 5;
        String durum;
        durum = (ortalama > 55) ? "Tebrikler sınıfı geçtiniz!" : "Sınıfta kaldınız!";

        System.out.println("Sınıfı geçme ortalamanız:" + ortalama + " Sınıfı geçme durumunuz: " + durum);
    }

}

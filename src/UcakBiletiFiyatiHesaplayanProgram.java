import java.util.Scanner;

public class UcakBiletiFiyatiHesaplayanProgram {
    public static void main(String[] args) {
        String isimSoyisim;
        int mesafe, yas, yolculukTipi;
        double tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhaba! İsim - Soyisminizi giriniz:");
        isimSoyisim = scanner.nextLine();
        System.out.println("Sayın " + isimSoyisim + " Lütfen yaşınızı giriniz:" );
        yas = scanner.nextInt();
        if ( yas < 0) {
            System.out.println("Hatalı veri girdiniz lütfen kontrol ediniz!");
            return;
        }
        System.out.println("Sayın " + isimSoyisim + " Lütfen gideceğiniz mesafeyi Km cinsinden giriniz:" );
        mesafe = scanner.nextInt();
        if ( mesafe < 0) {
            System.out.println("Hatalı veri girdiniz lütfen kontrol ediniz!");
            return;
        }
        System.out.println("Sayın " + isimSoyisim + " Lütfen yolculuk türünüzü seçiniz: \n1-Tek yön 2-Gidiş-Dönüş " );
        yolculukTipi = scanner.nextInt();
        if ( yolculukTipi > 3 || yolculukTipi < 0) {
            System.out.println("Hatalı veri girdiniz lütfen kontrol ediniz!");
            return;
        }

        tutar = mesafe * 0.1;

        if (yas < 12) {
            System.out.println("Tebrikler %50 indirim biletinize tanımlandı!");
            tutar *= 0.50;
        }
        if (yas > 12 && yas < 24) {
            System.out.println("Tebrikler %10 indirim biletinize tanımlandı!");
            tutar *= 0.90;
        }
        if (yas > 65) {
            System.out.println("Tebrikler %30 indirim biletinize tanımlandı!");
            tutar *= 0.70;
        }
        if (yolculukTipi == 2) {
            System.out.println("Tebrikler %20 indirim biletinize tanımlandı!");
            tutar *= 0.80;
        }
        System.out.println("Sayın " + isimSoyisim + ", biletinizin ücreti:" + tutar);
    }
}

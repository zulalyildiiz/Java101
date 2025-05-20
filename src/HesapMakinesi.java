import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int secim;
        double deger1, deger2;
        double sonuc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n");
        System.out.println("1 - Toplama\n");
        System.out.println("2 - Çıkarma\n");
        System.out.println("3 - Çarpma\n");
        System.out.println("4 - Bölme\n");
        secim = scanner.nextInt();
        if (secim < 1 || secim > 4) {
            System.out.println("Geçersiz işlem seçimi!");
            return;
        }
        System.out.println("İşlemi yapmak istediğiniz 1.değeri seçiniz:\n");
        deger1 = scanner.nextDouble();
        System.out.println("İşlemi yapmak istediğiniz 2.değeri seçiniz:\n");
        deger2 = scanner.nextDouble();

        switch (secim) {
            case 1:
                sonuc = deger1 + deger2;
                break;
            case 2:
                sonuc = deger1 - deger2;
                break;
            case 3:
                sonuc = deger1 * deger2;
                break;
            case 4:
                sonuc = deger1 / deger2;
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);

    }
}

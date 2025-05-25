import java.util.Scanner;

public class GirilenSayilardanMaxMinBulanProgram {
    public static void main(String[] args) {
        int n;
        int sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç sayı gireceksiniz?");
        n = scanner.nextInt();
        System.out.println("1. sayıyı giriniz: ");
        sayi = scanner.nextInt();
        int enBuyukSayi = sayi;
        int enKucukSayi = sayi;

        for (int i = 1; i < n; i++) {
            System.out.println((i+1) + ".Sayıyı giriniz:");
            sayi = scanner.nextInt();

            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }
            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }
        }

        System.out.println("Girdiğiniz sayıların içerisinde en büyük sayı: " + enBuyukSayi);
        System.out.println("Girdiğiniz sayıların içerisinde en küçük sayı: " + enKucukSayi);
    }
}

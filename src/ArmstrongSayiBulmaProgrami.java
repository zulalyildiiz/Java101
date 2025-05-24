import java.util.Scanner;
import java.lang.Math;

public class ArmstrongSayiBulmaProgrami {
    public static void main(String[] args) {
        int basamakSayisi = 0;
        int toplam = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Değerlendirmek istediğiniz sayıyı giriniz:");
        int orijinalSayi = scanner.nextInt();

        /* basamak sayısı bulma */
        int geciciSayi = orijinalSayi;
        while (geciciSayi != 0){
            geciciSayi /= 10;
            basamakSayisi++;
        }
        geciciSayi = orijinalSayi;
        while (geciciSayi != 0){
            int basamak = geciciSayi % 10;
            toplam += (int) Math.pow(basamak, basamakSayisi);
            geciciSayi /= 10;
        }

        if (toplam == orijinalSayi) {
            System.out.println(orijinalSayi + " bir Armstrong sayıdır.");
        } else {
            System.out.println(orijinalSayi + " bir Armstrong sayı değildir.");
        }

    }
}

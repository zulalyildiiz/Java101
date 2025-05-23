import java.util.Scanner;

public class GirilenCiftve4unKatiSayilariToplayanP {
    public static void main(String[] args) {
        double sayi;
        double toplam = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Lütfen sayı giriniz:");
            sayi = scanner.nextDouble();
            if (sayi %4 == 0 && sayi %2 == 0 ) {
                toplam += sayi;
            }

        }
        while (sayi %2 == 0);
            System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı:" + toplam);
    }
}

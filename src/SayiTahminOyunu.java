import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int sayi = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int hak = 0;
        int deger;
        while (hak < 5) {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz: ");
            deger = scanner.nextInt();
            if (deger < 0 && deger > 100) {
                System.out.println("Lütfen tanımlı değer aralığında bir değer giriniz!");
                break;
            }
            if (deger == sayi) {
                System.out.println("Tebrikler doğru tahmin ettiniz!");
                break;
            }
            hak ++;
            System.out.println("Kalan hakkınız: " + (5 - hak));
        }
        if (hak == 5) {
            System.out.println("Bilemediniz, sayı " + sayi + " idi.");
        }
    }
}

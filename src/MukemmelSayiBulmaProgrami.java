import java.util.Scanner;

public class MukemmelSayiBulmaProgrami {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayının kendisi hariç pozitif tam sayı çarpanları toplamı kendisine eşit olan sayıya mükemmel sayı denir.");
        System.out.println("Mükemmel sayı olup olmadığını kontrol etmek istediğiniz sayıyı giriniz:");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }

}

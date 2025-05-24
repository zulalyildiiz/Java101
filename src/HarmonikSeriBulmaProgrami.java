import java.util.Scanner;
public class HarmonikSeriBulmaProgrami {
    public static void main(String[] args) {
        int sayi;
        double sonuc = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Harmonik serisinin toplam değerini bulmak istediğiniz sayıyı giriniz:");
        sayi = scanner.nextInt();

        for (double i = 1; i <= sayi ; i++) {
            sonuc += ( 1 / i );
        }
        System.out.println("Girdiğiniz sayının harmonik serisi değeri: " + sonuc);
    }
}


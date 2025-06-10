import java.util.Scanner;

public class Oruntu {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi = scanner.nextInt();

        oruntu(sayi);
    }
    public static void oruntu(int sayi){
        int orijinalSayi = sayi;
        while (sayi > 0) {
            System.out.print(sayi + " ");
            sayi -= 5;
        }

        System.out.print(sayi + " ");

        while (sayi <= orijinalSayi ) {
            sayi += 5;
            System.out.print(sayi + " ");
        }


    }

}

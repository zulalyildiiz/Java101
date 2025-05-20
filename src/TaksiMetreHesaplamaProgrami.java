import java.util.Scanner;

public class TaksiMetreHesaplamaProgrami {
    public static void main(String[] args) {
        double taksimetreAcilisUcreti, kmBasiUcret, mesafe, tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taksimetre açılış ücreti giriniz:");
        taksimetreAcilisUcreti = scanner.nextDouble();

        System.out.println("Kilometre başı ücreti giriniz:");
        kmBasiUcret = scanner.nextDouble();

        System.out.println("Mesafeyi giriniz:");
        mesafe = scanner.nextDouble();

        tutar = taksimetreAcilisUcreti + ( kmBasiUcret * mesafe );
        tutar = ( tutar < 20 ) ? 20 : tutar;

        System.out.println("Ödemeniz gereken tutar: " + tutar);
    }
}

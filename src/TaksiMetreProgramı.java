import java.util.Scanner;

public class TaksiMetreProgramı {
    public static void main(String[] args) {
        double taksiMetreAcilisUcreti, kmBasiUcret, mesafe, ucret;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taksimetre açılış ücretini giriniz:");
        taksiMetreAcilisUcreti = scanner.nextDouble();

        System.out.println("Kilometre başı ücreti giriniz:");
        kmBasiUcret = scanner.nextDouble();

        System.out.println("Mesafeyi giriniz:");
        mesafe = scanner.nextDouble();

        ucret = taksiMetreAcilisUcreti + (kmBasiUcret*mesafe);
        ucret = (ucret < 20) ? 20 : ucret;

        System.out.println("Ödemeniz gereken ücert:" + ucret);
    }
}

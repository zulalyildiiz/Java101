import java.util.Scanner;

public class KDVHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvOrani;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tutarı giriniz: ");
        tutar = scanner.nextDouble();
        System.out.println("KDV Oranını giriniz: ");
        kdvOrani = scanner.nextDouble();

        double kdvliTutar = tutar + (kdvOrani * tutar);

        System.out.println("KDV Hariç tutar:" + tutar);
        System.out.println("KDV Dahil tutar:" + kdvliTutar);
        System.out.println("KDV Oranı:" + kdvOrani);

    }
}

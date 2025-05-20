import java.util.Scanner;
import java.lang.Math;

public class HipotenusHesaplayanProgram {
    public static void main(String[] args) {
        double kisaKenar, uzunKenar, hipotenus;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kısa kenarın değerini giriniz:");
        kisaKenar = scanner.nextDouble();

        System.out.println("Uzun kenarın değerini giriniz:");
        uzunKenar = scanner.nextDouble();

        kisaKenar = Math.pow(kisaKenar, 2);
        uzunKenar = Math.pow(uzunKenar, 2);

        hipotenus = Math.sqrt(kisaKenar + uzunKenar);

        System.out.println("Hipotenüs = " + hipotenus);
    }
}

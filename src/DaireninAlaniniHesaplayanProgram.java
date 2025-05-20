import java.util.Scanner;
import java.lang.Math;

public class DaireninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        double yariCap, alan, cevre;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz:");
        yariCap = scanner.nextDouble();

        alan = ( Math.PI * (Math.pow(yariCap, 2)));
        cevre = 2 * Math.PI * yariCap;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}

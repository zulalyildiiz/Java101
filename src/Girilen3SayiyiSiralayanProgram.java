import java.util.Scanner;

public class Girilen3SayiyiSiralayanProgram {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        a = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz:");
        b = scanner.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz:");
        c = scanner.nextDouble();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else if (c > b) {
                System.out.println("a > c > b");
            }
        } else if ( b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else if (c > a) {
                System.out.println("b > c > a");
            }
        } else if ( c > a && c > b) {
            if (a > b) {
                System.out.println("c > a > b");
            } else if (b > a) {
                System.out.println("c > b > a");
            }
        }
    }
}

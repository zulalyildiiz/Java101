import java.util.Scanner;

public class KumSaatiProgrami {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kum saati yüksekliğini giriniz:");
        n = scanner.nextInt();

        for (int i = 0; i < n ; i++) { /*üst içgen*/
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*(n - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n ; i++) { /*alt içgen*/
            for (int j = 1; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

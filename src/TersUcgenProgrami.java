import java.util.Scanner;

public class TersUcgenProgrami {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz:");
        n = scanner.nextInt();

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

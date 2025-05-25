import java.util.Scanner;

public class FibanocciProgrami {
    public static void main(String[] args) {
        int n, next;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibanocci dizinizin uzunluğunu giriniz:");
        n = scanner.nextInt();

        int a = 0;
        int b = 1;

        if (n == 1) {
            System.out.print(a);
        }
        if (n == 0) {
            System.out.print("");
        }
        if (n > 2) {
            System.out.print(a);
            System.out.print(" " + b );
            for (int i = 0; i < n; i++) {
                next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
    }
}

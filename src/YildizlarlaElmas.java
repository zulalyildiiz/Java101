import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        int basamakSayisi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir değer giriniz:");
        basamakSayisi = scanner.nextInt();

        for (int i = 0; i < basamakSayisi ; i++) {
            for (int j = 0; j < (basamakSayisi - i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = (basamakSayisi - 2); i >= 0 ; i--) {
            for (int j = 0; j < (basamakSayisi - i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}


import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        int sayi;
        int faktoriyel = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen faktoriyelini hesaplamak istediğiniz sayıyı giriniz:");
        sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            faktoriyel = faktoriyel*i;
        }

        System.out.println("Girdiğiniz sayının faktoriyeli: " + faktoriyel);

    }
}

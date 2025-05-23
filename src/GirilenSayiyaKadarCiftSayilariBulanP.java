import java.util.Scanner;

public class GirilenSayiyaKadarCiftSayilariBulanP {
    public static void main(String[] args) {
        int girilenSayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz:");
        girilenSayi= scanner.nextInt();

        for ( int i = 1 ; i < girilenSayi; i++){
            if (i %2 == 0) {
                System.out.println(i);

            }
        }


    }
}

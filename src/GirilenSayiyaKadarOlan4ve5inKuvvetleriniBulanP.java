import java.util.Scanner;

public class GirilenSayiyaKadarOlan4ve5inKuvvetleriniBulanP {
    public static void main(String[] args) {
        int sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz:");
        sayi = scanner.nextInt();

        if (sayi >= 4) {
            System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri:");
            for( int i = 4 ; i <= sayi ; i*=4 ){
                System.out.println(i);
        }
        }
        if (sayi >= 5) {
            System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri:");
            for( int i = 5 ; i <= sayi ; i*=5 ){
                System.out.println(i);
            }
        }


    }
}

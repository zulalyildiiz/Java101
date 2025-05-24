import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {
        int sayi1, sayi2;
        int ebob = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("EBOB ve EKOK'unu bulmak istediğiniz ilk sayıyı giriniz:");
        sayi1 = scanner.nextInt();
        System.out.println("EBOB ve EKOK'unu bulmak istediğiniz ikinci sayıyı giriniz:");
        sayi2 = scanner.nextInt();

        if (sayi1 < sayi2) {
            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0){
                    ebob = i; /*ortak bölenleri sırayla yazdırdığı için en son yazdırdığı ortak bölenlerin en büyüğüdür*/
                }
            }
        } else if (sayi2 < sayi1){
            for (int i = 1; i <= sayi2; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0){
                    ebob = i;
                }
            }
        }
        int ekok = (sayi1*sayi2) / ebob;
        System.out.println("Girdiğiniz iki sayının EBOB değeri: " + ebob);
        System.out.println("Girdiğiniz iki sayının EKOK değeri: " + ekok);
    }
}

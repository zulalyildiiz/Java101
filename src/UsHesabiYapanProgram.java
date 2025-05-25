import java.util.Scanner;

public class UsHesabiYapanProgram {
    public static int usHesapla(int taban, int us) {
        int sayi = 1;
        for (int i = 0; i < us; i++) {
            sayi *= taban;
        }
        return sayi;
    }
    public static void main(String[] args) {
        int sayi, us, taban;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kuvvetini hesaplamak istediğiniz sayının taban değerini giriniz:");
        taban = scanner.nextInt();
        System.out.println("Kuvvetini hesaplamak istediğiniz sayının üs değerini giriniz:");
        us = scanner.nextInt();
        sayi = usHesapla(taban, us);
        System.out.println(sayi);
    }
}

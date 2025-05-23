import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static int faktoriyel (int sayi){
        int sonuc = 1;
        for (int i = 1; i <= sayi ; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int n,r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("n değerini giriniz");
        n = scanner.nextInt();
        System.out.println("r değerini giriniz");
        r = scanner.nextInt();

        if (r > n || n < 0 || r < 0){
            System.out.println("Hatalı giriş yaptınız! n >= r >= 0 olmalı!");
        } else {
            int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + "," + r + ")= " + kombinasyon);
        }

    }
}

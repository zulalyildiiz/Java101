import java.util.Scanner;
import java.lang.Math;

public class GelismisHesapMakinesi {
    static void toplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamak istediğiniz ilk sayıyı giriniz:");
        double a = scanner.nextDouble();
        System.out.println("Toplamak istediğiniz ikinci sayıyı giriniz:");
        double b = scanner.nextDouble();
        double sonuc = a + b;
        System.out.println("İşleminizin sonucu: " + sonuc);
    }
    static void cikarma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkarmak istediğiniz ilk sayıyı giriniz:");
        double a = scanner.nextDouble();
        System.out.println("Çıkarmak istediğiniz ikinci sayıyı giriniz:");
        double b = scanner.nextDouble();
        double sonuc = a - b;
        System.out.println("İşleminizin sonucu: " + sonuc);
    }
    static void carpma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çarpmak istediğiniz ilk sayıyı giriniz:");
        double a = scanner.nextDouble();
        System.out.println("Çarpmak istediğiniz ikinci sayıyı giriniz:");
        double b = scanner.nextDouble();
        double sonuc = a * b;
        System.out.println("İşleminizin sonucu: " + sonuc);
    }
    static void bolme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bölmek istediğiniz ilk sayıyı giriniz:");
        double a = scanner.nextDouble();
        System.out.println("Bölmek istediğiniz ikinci sayıyı giriniz:");
        double b = scanner.nextDouble();
        double sonuc = a / b;
        System.out.println("İşleminizin sonucu: " + sonuc);
    }
    static void uslu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kuvvetini hesaplamak istediğiniz sayının taban değerini giriniz:");
        double a = scanner.nextDouble();
        System.out.println("Kuvvetini hesaplamak istediğiniz sayının üs değerini giriniz:");
        double b = scanner.nextDouble();
        double sonuc = Math.pow(a, b);
        System.out.println("İşleminizin sonucu: " + sonuc);
    }
    static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı giriniz:");
        int n = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        System.out.println("İşleminizin sonucu: " + faktoriyel);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Hoş geldiniz! Lütfen yapmak istediğiniz işlemi seçiniz:
                1 - Toplama
                2 - Çıkarma
                3 - Çarpma
                4 - Bölme
                5 - Üs Alma
                6 - Faktoriyel Hesaplama
                """;
        System.out.println(menu);
        int secim = scanner.nextInt();

        switch (secim){
            case 1 :
                toplama();
                break;
            case 2 :
                cikarma();
                break;
            case 3 :
                carpma();
                break;
            case 4 :
                bolme();
                break;
            case 5 :
                uslu();
                break;
            case 6 :
                faktoriyel();
                break;
            default:
                System.out.println("Geçerli bir seçim yapmadınız lütfen kontrol ediniz!");
        }
    }
}

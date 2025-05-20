import java.util.Scanner;

public class KullaniciGirisUygulamasi {
    public static void main(String[] args) {
        String kullaniciAdi = "Patika";
        String sifre = "123";
        String girilenKullaniciAdi, girilenSifre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz:");
        girilenKullaniciAdi = scanner.nextLine();

        System.out.println("Şifreyi giriniz:");
        girilenSifre = scanner.nextLine();

        if ( girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre)) {
            System.out.println("Başarıyla giriş yaptınız!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı, lütfen kontrol ediniz:");
        }
    }
}

import java.util.Scanner;

public class ATMProgrami {
    public static void main(String[] args) {
        int secim;
        int bakiye = 1500;
        int hak = 3;
        String kullaniciAdi;
        String parola;

        Scanner scanner = new Scanner(System.in);

        while (hak > 0){
            System.out.println("Hoş geldiniz! Lütfen kullanıcı adınızı giriniz:");
            kullaniciAdi = scanner.nextLine();
            System.out.println("Sayın " + kullaniciAdi + " lütfen parolanızı giriniz:");
            parola = scanner.nextLine();

            if (kullaniciAdi.equals("Zülco") && parola.equals("1234")) {
                System.out.println("Sayın " + kullaniciAdi + " bankamıza hoş geldiniz!");

                while (true){
                    System.out.println("Lütfen yapmak istediğiniz işlemi tuşlayınız:");
                    System.out.println("1 - Bakiye Sorgulama");
                    System.out.println("2 - Para Çekme");
                    System.out.println("3 - Para Yatırma");
                    System.out.println("4 - Çıkış Yapma");
                    secim = scanner.nextInt();

                    switch (secim){
                        case 1 :
                            System.out.println("Sayın " + kullaniciAdi + " hesabınızdaki bakiye tutarı: " + bakiye);
                            break;
                        case 2 :
                            System.out.println("Çekmek istediğiniz para miktarını tuşlayınız:");
                            int paraCek = scanner.nextInt();
                            if (paraCek <= bakiye) {
                                bakiye -= paraCek;
                                System.out.println("Sayın " + kullaniciAdi + " hesabınızdaki bakiye tutarı: " + bakiye);
                            } else {
                                System.out.println("Bakiye yetersiz!");
                            }
                            break;
                        case 3 :
                            System.out.println("Yatırmak istediğiniz para miktarını tuşlayınız:");
                            int paraYatir = scanner.nextInt();
                            bakiye += paraYatir;
                            System.out.println("Sayın " + kullaniciAdi + " hesabınızdaki bakiye tutarı: " + bakiye);
                            break;
                        case 4 :
                            System.out.println("Görüşmek üzere hoşça kalın!");
                            return;
                        default:
                            System.out.println("Geçersiz seçim. Lütfen 1-4 arası bir sayı girin.");
                    }
                }
            } else {
                System.out.println("Yanlış kullanıcı adı veya parola girdiniz, lütfen kontrol ediniz!");
                hak--;
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur! Müşteri hizmetlerimizle iletişime geçebilirsiniz!");
                } else {
                    System.out.println("Kalan işlem hakkınız: " + hak);
                }
            }

        }



    }
}

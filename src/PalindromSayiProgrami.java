import java.util.Scanner;

public class PalindromSayiProgrami {
    public static boolean isPolindrom(int sayi){
        int temp = sayi;  /*temp - geçici*/
        int sayininTersi =0;
        int sonHanesi;
        while (temp != 0){
            System.out.println("İlk girdiğiniz sayı: " + temp);

            sonHanesi = temp % 10;

            sayininTersi = ( sayininTersi * 10 ) + sonHanesi;
            System.out.println("Sayının tersi: " + sayininTersi);

            temp /= 10;
        }
        if (sayininTersi == sayi) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.");
        System.out.println("Palindrom olduğunu kontrol etmek istediğiniz sayıyı giriniz:");
        n = scanner.nextInt();
        if (isPolindrom(n)) {
            System.out.println(n + " bir polindrom sayıdır.");
        }else {
            System.out.println(n + " bir polindrom sayı değildir.");
        }
    }
}

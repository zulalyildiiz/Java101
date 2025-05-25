import java.util.Scanner;

public class RecursiveAsalSayiBulanProgram {
    public static boolean isAsalSayi(int sayi, int bolen){
        /* bolen = sayi - 1 */
        /* 1'e kadar bölünecek başka sayı kalmadıysa asal demektir  */
        if (bolen == 1) {
            return true;
        }

        /* Eğer sayı herhangi bir bölenine tam bölünüyorsa asal değildir */
        if (sayi % bolen == 0) {
            return false;
        }

        /* Bir önceki böleni dene (recursive çağrı) */
        return isAsalSayi(sayi, bolen - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asallığını kontrol etmek istediğiniz sayıyı giriniz:");
        int sayi = scanner.nextInt();
        if (sayi < 2) {
            System.out.println(sayi + " bir asal sayı değildir.");
            return;
        }
        if (isAsalSayi(sayi, sayi - 1)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
}

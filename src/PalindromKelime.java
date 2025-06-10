import java.util.Scanner;
public class PalindromKelime {
    static boolean isPolindrom (String string){
        String kelimeninTersi = "";
        for (int i = (string.length() - 1); i >= 0 ; i++) {
            kelimeninTersi += string.charAt(i);
        }
        if (string.equals(kelimeninTersi)) {
            return true;
        } else {
            return false;
        }
    }
    static boolean isPolindrom2 ( String string ) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            if (string.charAt(i) != string.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kelime = "";
        System.out.println("Palindromluğunu doğrulamak istediğiniz kelimeyi giriniz: ");
        kelime = scanner.nextLine();
        if (isPolindrom2(kelime)){
            System.out.println(kelime + " bir palindrom kelimedir.");
        } else {
            System.out.println(kelime + " bir palindrom kelime değildir.");
        }
    }
}

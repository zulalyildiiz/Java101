import java.util.Scanner;
public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int taban, us;
        int total = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üssünü almak istediğiniz sayının taban değerini giriniz:");
        taban = scanner.nextInt();
        System.out.println("Üssünü almak istediğiniz sayının üs değerini giriniz:");
        us = scanner.nextInt();

        for (int i = 1; i <= us ; i++) {
            total *= taban;
        }
        System.out.println(taban + " sayısının " + us + ". kuvveti = " + total);
    }
}

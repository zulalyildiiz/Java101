import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlariSiralayanProgram {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizideki eleman sayısını giriniz: ");
        n = scanner.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }
        System.out.println("Oluşturduğunuz dizi: " + Arrays.toString(dizi));

        // Selection Sort ile küçükten büyüğe sıralama
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                    // Yer değiştirme
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        System.out.println("Sıralanmış dizi: " + Arrays.toString(dizi));
    }
}

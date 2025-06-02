import java.util.Scanner;
public class MatrisTranspozunuAlanProgram {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin kaç satırdan oluştuğunu giriniz: ");
        n = scanner.nextInt();
        System.out.print("Dizinin kaç sütundan oluştuğunu giriniz: ");
        m = scanner.nextInt();
        int[][] matris = new int[n][m];
        int[][] tersMatris = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("matris[" + i + "][" + j + "]:");
                matris[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tersMatris[j][i] = matris[i][j];
            }
        }
        System.out.println("\nOrijinal Matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTers Matris:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tersMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}

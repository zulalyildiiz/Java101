import java.util.Scanner;

public class VKIHesaplayanProgram {
    public static void main(String[] args) {
        double boy, kilo, vki;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Boy ölçünüzü giriniz (cm cinsinden):");
        boy = scanner.nextDouble();

        System.out.println("Kilo ölçünüzü giriniz (kg cinsinden):");
        kilo = scanner.nextDouble();

        boy = boy / 100;
        vki = kilo / ( boy * boy );

        System.out.println("Vücut-Kitle İndeksiniz:" + vki );

    }
}

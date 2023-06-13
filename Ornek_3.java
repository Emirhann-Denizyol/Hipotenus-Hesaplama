import java.util.Scanner;


public class Ornek_3 {
    public static void main(String[] args) {
        double dik1, dik2, hipotenus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. dik kenarı giriniz : ");
        dik1 = scanner.nextDouble();
        System.out.println("2. dik kenarı giriniz : ");
        dik2 = scanner.nextDouble();
        hipotenus = Math.sqrt(Math.pow(dik1, 2) + Math.pow(dik2, 2));
        System.out.println("Hipotenus uzunluğunuz : " + hipotenus);
    }
}

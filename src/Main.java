import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını başlatma
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alma
        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        // Değerleri ekrana yazdırma (önceki durum)
        System.out.println("\nDeğiştirilmeden önce:");
        System.out.println("Birinci sayı: " + num1);
        System.out.println("İkinci sayı: " + num2);

        // Değerleri değiştirme
        num1 = num1 + num2; // num1 artık num1 + num2'nin toplamı
        num2 = num1 - num2; // num2 artık num1'in eski değerini alır
        num1 = num1 - num2; // num1 num2'nin eski değerini alır

        // Değerleri ekrana yazdırma (sonraki durum)
        System.out.println("\nDeğiştirildikten sonra:");
        System.out.println("Birinci sayı: " + num1);
        System.out.println("İkinci sayı: " + num2);

        // Scanner'ı kapatma
        scanner.close();
    }
}
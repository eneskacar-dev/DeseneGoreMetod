import java.util.Scanner;

public class Main {

    static void sayiDuzenle(int sayi, int sinir, boolean artis) {
        System.out.print(sayi + " ");

        if (sayi <= 0 && !artis) {
            return;
        } else {
            if (sayi <= 0) {
                sayiDuzenle(sayi + 5, sinir, true);
            } else {
                sayiDuzenle(sayi - 5, sinir, artis);
            }
            System.out.print(sayi + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int girilenSayi = scanner.nextInt();

        sayiDuzenle(girilenSayi, girilenSayi, false);

        scanner.close();
    }
}

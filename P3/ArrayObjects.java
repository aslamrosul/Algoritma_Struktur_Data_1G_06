
/**
 * ArrayObjects
 */
import java.util.Scanner;
public class ArrayObjects {
    public static int banyak;
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.print("Masukkan banyak persegi panjang: ");
        banyak = sc06.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[banyak];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc06.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc06.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
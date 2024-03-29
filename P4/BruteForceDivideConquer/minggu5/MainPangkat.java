package P4.BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc06.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc06.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc06.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("===============================================================");
        System.out.println("Pilih Metode Untuk Menghitungnya :");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide & Conquer");
        System.out.println("===============================================================");
        System.out.print("==+-> : ");
        int pilihan = sc06.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT -- BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
                            +png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT -- DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
                            +png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                break;
        }

    }
}

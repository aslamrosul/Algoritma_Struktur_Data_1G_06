import java.util.Scanner;
/**
 * mainLatihanPraktikum
 */
public class main3BangunRuang {
    public static void main(String[] args) {
Scanner sc06 = new Scanner(System.in);
        System.out.print("Masukkan Jari2 Kerucut: ");
        Kerucut.jari2 = sc06.nextDouble();
        System.out.print("Masukkan Sisi Miring Kerucut: ");
        Kerucut.sisiMiring = sc06.nextDouble();
        System.out.print("Masukkan Sisi Alas Limas: ");
        LimasSegiEmpatSamaSisi.sisiAlas = sc06.nextInt();
        System.out.print("Masukkan Tinggi Limas: ");
        LimasSegiEmpatSamaSisi.tinggiLimas  = sc06.nextInt();
        Kerucut.tinggiKerucut  = LimasSegiEmpatSamaSisi.tinggiLimas;
        System.out.print("Masukkan Jari2 Bola: ");
        Bola.jari2 = sc06.nextDouble();
        System.out.println("Volume kerucut: "+ Kerucut.hitungVolume());
        System.out.println("Luas Permukaan Kerucut: "+ Kerucut.hitungLuasPermukaan());
        System.out.println("Volume Limas Segi Empat Sama Sisi: " +LimasSegiEmpatSamaSisi.hitungVolume());
        System.out.println("Luas Permukaan Limas Segi Empat Sama Sisi: "+ LimasSegiEmpatSamaSisi.hitungLuasPermukaan());
        System.out.println("Volume Bola: "+ Bola.hitungVolume());
        System.out.println("Luas Permukaan Bola: "+ Bola.hitungLuasPermukaan());
    }
}


    // PersegiPanjang[] ppArray = new PersegiPanjang[3];

        // for (int i = 0; i < 3; i++) {
        //     ppArray[i] = new PersegiPanjang();
        //     System.out.println("Persegi panjang ke-" + i);
        //     System.out.print("Masukkan panjang: ");
        //     ppArray[i].panjang = sc06.nextInt();
        //     System.out.print("Masukkan lebar: ");
        //     ppArray[i].lebar = sc06.nextInt();
        // }

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Persegi panjang ke-" + i);
        //     System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        // }
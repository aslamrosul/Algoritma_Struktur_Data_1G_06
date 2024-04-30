import java.util.Scanner;
public class Utama06 {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        int kapasitas;
boolean ulangi = true;
System.out.print("Masukkan banyak kapasitas Gudang : ");
kapasitas = sc06.nextInt();
Gudang06 gudang = new Gudang06(kapasitas);
        while (ulangi) {
            
            System.out.println("Manu: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc06.nextInt();
            sc06.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc06.nextInt();
                    sc06.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc06.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc06.nextLine();
                    Barang06 barangBaru = new Barang06(kode, nama, kategori);
                   gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                gudang.ambilBarang();
                break;
                case 3:
                gudang.tampilkanBarang();
                break;
                case 4:
                gudang.lihatBarangTeratas();
                break;
                case 5:
                ulangi = false;
                default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi. ");
                    break;
            }
        }
    }
}

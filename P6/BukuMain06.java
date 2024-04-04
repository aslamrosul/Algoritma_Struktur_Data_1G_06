package P6;

import java.util.Scanner;

public class BukuMain06 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku06 data = new PencarianBuku06();
        int jumBuku = 5;

        System.out.println("---------------------------------------------------------");
    System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
   for (int i = 0; i <jumBuku; i++) {
    System.out.println("--------------------------");
    System.out.print("Kode Buku \t : ");
    int kodeBuku = s.nextInt();
    System.out.print("Judul Buku \t : ");
    String judulBuku = s1.nextLine();
    System.out.print("Tahun Terbit \t : ");
    int tahunTerbit = s.nextInt();
    System.out.print("Pengerang \t : ");
    String pengarang = s1.nextLine();
    System.out.print("Stock \t\t : ");
    int stock = s.nextInt();

    Buku06 m = new Buku06(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
    data.tambah(m);
    
   }

System.out.println("---------------------------------------------------------");
System.out.println("Data keseluruhan Mahasiswa : ");
data.tampil();

System.out.println("---------------------------------------------------------");
System.out.println("---------------------------------------------------------");
System.out.println("Pencarian Data : ");
System.out.println("Masukkan Kode Buku yang dicari : ");
System.out.print("Kode Buku : ");
int cari = s.nextInt();
System.out.println("menggunakan sequential Search");
int posisi = data.FindSeqSearch(cari);
data.TampilPosisi(cari, posisi);
data.TampilData(cari, posisi);

Buku06 dataBuku = data.FindBuku(cari);
dataBuku.tampilDataBuku();

}
}

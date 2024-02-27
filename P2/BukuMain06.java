package P2;
public class BukuMain06 {
    public static void main(String[] args) {
        Buku06 bk1 = new Buku06();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13; 
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5); 
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku06 bk2 = new Buku06("Self Reward", "Maheera Ayesha", 160, 29, 50000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku06 bukuAslam = new Buku06("Buku Aslam", "Aslam", 10000, 10000, 100000);
        bukuAslam.terjual(11);
        bukuAslam.tampilInformasi();
        bukuAslam.gantiHarga(200000);
        bukuAslam.tampilInformasi();
        bukuAslam.hitungHargaTotal( 11);
        bukuAslam.hitungDiskon();
        bukuAslam.hitungHargaBayar();
        System.out.println( bukuAslam.hitungHargaTotal( 11));
        System.out.println(
        bukuAslam.hitungDiskon());
        System.out.println(
        bukuAslam.hitungHargaBayar());
     bukuAslam.tampilInformasi();
    }
}

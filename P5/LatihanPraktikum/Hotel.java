package P5.LatihanPraktikum;

public class Hotel {
    String nama, kota;
    int harga;
    Byte bintang;

    Hotel (String n, String k, int h, Byte b){
nama = n;
kota = k;
harga = h;
bintang = b;
    }
    void tampil(){
        System.out.println("Nama Hotel = "+nama);
        System.out.println("Kota = "+kota);
        System.out.println("Harga = "+harga);
        System.out.println("Bintang = "+bintang);
    }
}

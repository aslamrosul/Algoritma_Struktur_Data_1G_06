package P2;

public class Buku06 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal;
    double hargaDiskon, hargaBayar;

public Buku06(){
    
}

public Buku06(String jud, String pg, int hal, int stok, int har){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
}
void tampilInformasi(){
  System.out.println("Judul: "+ judul);
  System.out.println("Pengarang: "+ pengarang);
  System.out.println("Jumlah Halaman: "+ halaman);
  System.out.println("Sisa stock: "+ stok);
  System.out.println("Harga: Rp "+ harga);
}
void terjual(int jml){
    if (stok >= jml) {
        stok -= jml; 
}
}
void restock(int jml){
stok += jml;
}
int gantiHarga(int hrg) {
    harga = hrg;
    return harga;
}
int hitungHargaTotal( int jml){
   hargaTotal = harga*jml;
return hargaTotal;
}
double hitungDiskon (){
if (hargaTotal > 150000) {
    hargaDiskon = hargaTotal*0.12;
   return hargaDiskon;
} else if (hargaTotal >= 75000){
     hargaDiskon = hargaTotal*0.05;
   return hargaDiskon;
} else {
     hargaDiskon = hargaTotal*0;
    return hargaDiskon;
}  
}
double hitungHargaBayar(){
    hargaBayar = hargaTotal-hargaDiskon;
return hargaBayar; 
}
}


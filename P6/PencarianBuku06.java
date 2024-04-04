package P6;
public class PencarianBuku06 {
 Buku06 listBk[] = new Buku06 [5];
 int idx;
 void tambah(Buku06 m){
    if (idx < listBk.length) {
        listBk[idx] = m;
        idx++;
    } else {
        System.out.println("Data sudah penuh!");
    }
 }
 void tampil(){
    for (Buku06 m : listBk) {
        m.tampilDataBuku();
    }
 }
public int FindSeqSearch(int cari){
    int posisi = 0 ;
    for (int j = 0; j < listBk.length; j++) {
        if (listBk[j].kodeBuku == cari) {
            posisi = j;
            break;
        }else {
            posisi = -1;
        }
    }
    return posisi;
}
public void TampilPosisi(int x, int pos){
    if (pos!= -1) {
        System.out.println("data : "+ x + " ditemukan pada indeks "+ pos);
    }else {
        System.out.println("data : "+ x + " tidak ditemukan");
    }
}
public void TampilData(int x, int pos){
    if (pos!= -1) {
        System.out.println("Kode Buku\t : "+ x );
    System.out.println("Judul\t\t : "+ listBk[pos].judulBuku);
    System.out.println("Tahun Terbit\t : "+ listBk[pos].tahunTerbit);
    System.out.println("Pengarang\t : "+ listBk[pos].pengarang);
    System.out.println("Stock\t\t : "+listBk[pos].stock);
    }else {
        System.out.println("data : "+ x + " tidak ditemukan");
    }
}

public Buku06 FindBuku(int cari){
    for (int j = 0; j < listBk.length; j++) {
        if (listBk[j].kodeBuku == cari) {
            return listBk[j];
        }
    }
    return null;
}

public int FindBinarySearch(int cari, int left, int right){
int mid;
if (left  <= right) {
    mid = (right + left)/ 2;
    if (cari == listBk[mid].kodeBuku) {
        return mid;
    } else if (listBk[mid].kodeBuku > cari) {
        return FindBinarySearch(cari, left, mid-1);
    } else {
        return FindBinarySearch(cari, mid+1, right);
    }
}
return -1;
}
}

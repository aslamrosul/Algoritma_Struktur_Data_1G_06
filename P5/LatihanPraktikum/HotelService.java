package P5.LatihanPraktikum;
public class HotelService {
    Hotel rooms[] = new Hotel[5];
int idx;
 void tambah(Hotel r){
    if (idx<rooms.length) {
        rooms[idx] = r;
        idx++;
                }else{
                    System.out.println("Data sudah penuh!!");
                }
 }
 void tampilAll(){
 for (Hotel r : rooms) {
    System.out.println("Nama Hotel = "+r.nama);
    System.out.println("Kota = "+r.kota);
    System.out.println("Harga = "+r.harga);
    System.out.println("Bintang = "+r.bintang);
        System.out.println("------------------------------");
        }
 }
 void bubbleSort(){
for (int i = 0; i < rooms.length-1; i++) {
    for (int j = 1; j < rooms.length-i; j++) {
        if (rooms[j].harga < rooms[j-1].harga) {
            Hotel temp = rooms[j];
            rooms[j] = rooms[j-1];
            rooms[j-1]= temp;
        }
    }
}
 }
 void selectionSort(){
for (int i = 0; i < rooms.length-1; i++) {
    int idxMax = i;
    for (int j = i+1; j < rooms.length; j++) {
        if (rooms[j].bintang > rooms[idxMax].bintang) {
            idxMax = j;
        }
    }
    Hotel temp = rooms[idxMax];
    rooms[idxMax] = rooms[i];
    rooms[i] = temp;
}
 }
}

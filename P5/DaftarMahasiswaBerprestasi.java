package P5;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if (idx<listMhs.length) {
listMhs[idx] = m;
idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    //setelah ini tuliskan method tampil()
    void tampil(){
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }
    //setelah ini tuliskan method bubbleshort()
    void bubbleshort(){
        for (int i = 0; i < listMhs.length-1; i++) { 
            for (int j = 1; j < listMhs.length-i; j++) { 
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
                
            }
            
        }
    }
    //setelah ini tuliskan method selectionSort()
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin =i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

        //setelah ini tuliskan method selectionSort()
void insectionSort(){
    for (int i = 0; i < listMhs.length; i++) {
        Mahasiswa temp = listMhs[i]; int j = i;
        while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j-1];
            j--;
        }
        listMhs[j]=temp;
    }
}
}

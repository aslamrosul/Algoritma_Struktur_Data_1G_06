package P4.BruteForceDivideConquer.minggu5;



import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Masukan jumlah elemen: ");
    int iJml = sc06.nextInt();
    sc06.nextLine();
    
Faktorial[] fk = new Faktorial[iJml];//perbaikan 10 menjadi iJml
for (int i = 0; i < iJml; i++) {
    fk[i] = new Faktorial();
    System.out.println("Masukkan nilai data ke-"+(i+1)+" :");
    fk[i].nilai = sc06.nextInt(); // prubahan int nilai =, menjadi fk[i].nilai =
}

System.out.println("HASIL -- BRUTEFORCE");
for (int i = 0; i < iJml; i++) {
    System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah "+fk[i].faktorialBF(fk[i].nilai));
}

System.out.println("HASIL -- DIVIDE AND CONQUEROR");
   for (int i = 0; i < iJml; i++) {
    System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "+ fk[i].faktorialDC(fk[i].nilai));
   }

}
}


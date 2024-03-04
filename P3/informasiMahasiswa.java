import java.util.Scanner;
public class informasiMahasiswa {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        int jmlMhs;
        System.out.print("Masukkan banyak mahasiswa : ");
        jmlMhs = sc06.nextInt();
        sc06.nextLine(); // Membersihkan newline dari buffer
        Mahasiswa[] mhsArray = new Mahasiswa[jmlMhs];
        for (int i = 0; i < mhsArray.length; i++) {
            mhsArray[i] = new Mahasiswa();
        }
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            mhsArray[i].nama = sc06.nextLine();
            System.out.print("Masukkan nim : ");
            mhsArray[i].nim = sc06.nextDouble();
            sc06.nextLine(); // Membersihkan newline dari buffer
            System.out.print("Masukkan jenis kelamin : ");
            mhsArray[i].jenisKelamin = sc06.nextLine();
            System.out.print("Masukkan IPK : ");
            mhsArray[i].ipk = sc06.nextDouble();
            sc06.nextLine(); // Membersihkan newline dari buffer
        }
        System.out.println();
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("nama : " + mhsArray[i].nama);
            System.out.println("nim : " + mhsArray[i].nim);
            System.out.println("Jenis Kelamin : " + mhsArray[i].jenisKelamin);
            System.out.println("Nilai IPK : " +  mhsArray[i].ipk);
    }
      
    }
}

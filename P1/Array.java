package P1;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String MK [] ={ "Pancasila","Konsep Teknologi Informasi","Critical Thinking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        int SKS [] ={ 2,4,4,6,4,4,6,4};
        String nilaiHuruf[]= new String[MK.length];

        double nilaiAngka []= new double[MK.length];
        double bobotNilai []= new double[MK.length];
        double totalBobot = 0.0;
        int totalSKS = 0;
        double totalNilai =0.0;

        Scanner input06 = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        for (int i = 0; i < MK.length; i++) {
            System.out.print("masukkan nilai angka untuk MK "+ MK[i]+ ": ");
            nilaiAngka[i] = input06.nextDouble();
            if (nilaiAngka[i] > 100 && nilaiAngka[i] < 0) {
                System.out.println("Input Nilai Salah");
            } else {       
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i]=4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i]=3.50;
            }  else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i]=3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65){
                nilaiHuruf[i] = "C+";
                bobotNilai[i]=2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i]=2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i]=1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i]=0.00;
            }

            input06.nextLine();
        }
        }
       
        System.out.printf("%n%nHASIL KONVERSI NILAI%n");
        System.out.printf("=======================%n");
        System.out.printf("%-40s%10s%15s%15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------------------------");

       
for (int i = 0; i < MK.length; i++) {
    totalBobot += bobotNilai[i]*SKS[i];
}
System.out.println(totalBobot);
for (int i = 0; i < MK.length; i++) {
    totalSKS += SKS[i];
}
System.out.println(totalSKS);
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.printf("%-40s%10s%15s%15s%n", MK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);          
         }
         System.out.println("======================");
         System.out.printf("IP : %.2f%n", totalBobot / totalSKS);
    }

}

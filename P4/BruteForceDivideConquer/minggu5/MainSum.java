package P4.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc06.nextInt();
        sc06.nextLine();
        Sum sm = new Sum(elm);
        System.out.println("===============================================================");
    for (int i = 0; i < sm.elemen; i++) {

        System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
         sm.keuntungan[i]= sc06.nextDouble();
    }
    System.out.println("=======================================================================");
    System.out.println("Algoritma Brute Force");
    System.out.println("Total kentungan perusahaan selama "+ sm.elemen + " bulan adalah = "+sm.totalBF(sm.keuntungan));
System.out.println("=========================================================================");
System.out.println("Algoritma Divide Conquer");
System.out.println("Total keuntungan prubahan selama "+ sm.elemen + " bulan adalah "+ sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
}
}
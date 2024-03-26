package P4.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("===============================================================");
        System.out.println("Masukkan jumlah perusahaan : ");
        int jmlPerusahaan = sc06.nextInt();
        sc06.nextLine();
        Sum[] sm = new Sum[jmlPerusahaan];
       
       
       
       for (int i = 0; i< sm.length; i++) {
        System.out.println();
        System.out.println("Masukkan data perusahaan ke-"+(i+1)+" : ");
        System.out.println("===============================================================");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc06.nextInt();
        System.out.println("===============================================================");
        sc06.nextLine();
        sm[i] = new Sum(elm);
         for (int j = 0; j < sm[i].elemen; j++) {
      
            System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
             sm[i].keuntungan[j]= sc06.nextDouble();
        }
       }
       
   for (int i = 0; i < sm.length; i++) {
    System.out.println();
    System.out.println("Total keuntungan perusahaan "+(i+1)+ " :");
  int j = sm[i].keuntungan.length;
         System.out.println("=======================================================================");
         System.out.println("Algoritma Brute Force");
         System.out.println("Total kentungan perusahaan selama "+ sm[i].elemen + " bulan adalah = "+sm[i].totalBF(sm[i].keuntungan));
     System.out.println("=========================================================================");
     System.out.println("Algoritma Divide Conquer");
     System.out.println("Total keuntungan prubahan selama "+ sm[i].elemen + " bulan adalah "+ sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
    
   }
}
}

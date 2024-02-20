package P1;
import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {

        Scanner input06 = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");  
        nilaiTugas = input06.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input06.nextDouble(); 
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = input06.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = input06.nextDouble();
        System.out.println("======================");

        if (nilaiTugas >= 0 && nilaiTugas <= 100 && nilaiKuis >= 0 && nilaiKuis <= 100 && nilaiUTS >= 0 && nilaiUTS <= 100&& nilaiUAS >= 0 && nilaiUAS <= 100) {
   
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            }  else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("======================");
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("======================");
            System.out.println("  nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }
        
        
      
        

    }
    
}
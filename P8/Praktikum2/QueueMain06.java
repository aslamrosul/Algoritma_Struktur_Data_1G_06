package P8.Praktikum2;
import java.util.Scanner;
public class QueueMain06 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("5. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian");
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc06.nextInt();
        Queue06 antri = new Queue06(jumlah);
int pilih;
        do {
            menu();
            pilih = sc06.nextInt();
            sc06.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc06.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc06.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc06.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc06.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc06.nextDouble();
                    Nasabah06 nb = new Nasabah06(norek, nama, alamat, umur, saldo);
                    sc06.nextLine();
                    antri.Enqueue(nb);
                    break;
            case 2:
            Nasabah06 data = antri.Dequeue();
            if (!"".equals(data.norek ) && !"".equals(data.nama ) && !"".equals(data.alamat )
             && data.umur != 0 && data.saldo != 0 ) {
                System.out.println("Antrian yang keluar: "+ data.norek + " "+ data.nama + " "+ data.alamat + " "
                + data.umur + " "+ data.saldo + " ");
                break;
            }
            case 3:
            antri.peek();
            break;
            case 4:
            antri.print();
            break;
                case 5:
                antri.peekRear();
                break;      }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}

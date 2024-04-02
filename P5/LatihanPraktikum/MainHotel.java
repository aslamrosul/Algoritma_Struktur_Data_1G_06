package P5.LatihanPraktikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
HotelService list = new HotelService();
        Hotel r1 = new Hotel("Ijen Suites", "Malang", 5000000, (byte) 5);
        Hotel r2 = new Hotel("RedDoorz", "Surabaya", 200000, (byte) 4);
        Hotel r3 = new Hotel("Surya", "Madura", 3000000, (byte) 3);
        Hotel r4 = new Hotel("Kencana", "Bengkulu", 6000000, (byte) 1);
        Hotel r5 = new Hotel("Mewah", "Manado", 2500000, (byte) 2);

list.tambah(r1);
list.tambah(r2);
list.tambah(r3);
list.tambah(r4);
list.tambah(r5);





Scanner sc06 = new Scanner(System.in);


        System.out.println("Tampilkan Hotel berdasarkan :");
        System.out.println("1. Harga dimulai dari harga termurah ke harga tertinggi.");
        System.out.println("2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1) ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("+==> : ");
        int pilihan = sc06.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Sorting Hotel berdasarkan Harga terendah");
                list.bubbleSort();
                list.tampilAll();
                break;
                case 2:
                System.out.println("Sorting Hotel berdasarkan Bintang tertinggi(5)");
list.selectionSort();
list.tampilAll();
                break;
        
            default:
            System.out.println("pilihan anda tidak ada!!");
                break;
        }

    }
}

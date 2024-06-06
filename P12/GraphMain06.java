package P12;

import java.util.Scanner;

public class GraphMain06 {
    public static void main(String[] args) throws Exception {
        GraphMatriks06 gdg = new GraphMatriks06(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
      
        System.out.println();
        System.out.println();
        Scanner sc06 = new Scanner(System.in);
        Graph06 gedung = new Graph06(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal: ");
        int asal = sc06.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc06.nextInt();
        gedung.printHasil(asal, tujuan);

    }
}

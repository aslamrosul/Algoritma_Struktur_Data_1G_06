package P12;

public class Graph06 {
    int vertex;
    DoubleLinkedList06 list[];

    public Graph06(int v) {
        vertex = v;
        list = new DoubleLinkedList06[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList06();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);// directed graph

        // list[tujuan].addFirst(asal, jarak);//undirected graph
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));

        // jika undirected graph
        // System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + list[asal].size());

    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void printHasil(int asal, int tujuan) throws Exception {
        for (int i = 0; i < asal+1; i++) {
            if (list[i].size() > 0) {
                if (i == asal) {
                    System.out.print("Gedung " + (char) ('A' + i) + " dan ");
                    
                    for (int j = 0; j < list[asal].size(); j++) {
                         
                        if (list[asal].get(j) == tujuan) {
                            System.out.println("Gedung "+ (char) ('A' + tujuan)  +" bertetangga");
                        }else {
                            System.out.println("Gedung "+ (char) ('A' + tujuan)  +" tidak bertetangga");
                        }
               }
                }
                
                System.out.println();
            }
        }
        System.out.println();
    }
}

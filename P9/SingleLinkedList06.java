package P9;

public class SingleLinkedList06 {
    Node06 head, tail;

    boolean isEmpty() {
        return head == null;// memperbaiki sebelumnya !=
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Node06 tmp = head;
            System.out.print("Isi Linked List: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addFirst(int input) {
        Node06 ndInput = new Node06(input, null);
        if (isEmpty()) {
            head = ndInput; 
            tail = ndInput;
            // menghapus kode yang tidak dibutuhkan
        } else {
            ndInput.next = head;
            head = ndInput;
             // menghapus kode yang tidak dibutuhkan
        }
    }

    void addLast(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addLast
        // memperbaiki konstruktor
        Node06 ndInput = new Node06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            // isi if dan else sebelumnya terbalik
        } else {
            tail.next = ndInput;
            tail = ndInput;

        }
    }

    void insertAfter(int key, int input) {
        // memeprbaiki konstruktor dibawah
        Node06 ndInput = new Node06(input, null);
        Node06 temp = head;
        // merubah do whilemenjadi while
        while (temp != null) {// selama masih ada node, lanjutkan
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {// jika tidak ada node selanjutnya                        
                       // maka jadikan ndInput sebagai tail
                    tail = ndInput;
                }
                break;// jangan lupa di rem, jangan gas terus!
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut berpindah
        // satu indeks setelahnya
        if (index < 0) {
            System.out.println("Indeks tidak valid");

        } else if (index == 0) {
            addFirst(input);
        } else {
            Node06 temp = head;
            for (int i = 0; i < index - 1; i++) { // menambah -1 pada index
                if (temp == null) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi batas");
                return;
            }

            temp.next = new Node06(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData (int index){
        // ambil nilai data tepat sesuai indeks yang ditunjuk
        Node06 tmp = head;
        for (int i = 0; i <index -1; i++) {//ganti menjadi 1
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key){
        // ketahui posisi nodemu ada di indeks sama
        Node06 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;    
        }else {
            return index;
        }
    }

void removeFirst(){
    if (isEmpty()) {// menghapus !
        System.out.println("Linked list ini masih kosong"
        + "tidak dapat dihapus");
    }else if (head == tail) {
        head = tail = null;
        
    }else {
      head = head.next;
    }
}

void removeLast(){
   
        if (isEmpty()) {
            System.out.println("Linked list ini masih kosong"
            + "tidak dapat dihapus");
    }else if (head == tail) {
        head =tail = null;
    }else {
        Node06 temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp.next;
    }
}

void remove(int key){
    if (isEmpty()) {
        System.out.println("Linked list ini masih kosong"
        + "tidak dapat dihapus");
    }else{
        Node06 temp = head;
        while (temp != null) {
        if (temp.data == key && temp == head) {
            removeFirst();
            break;
            
        }else if (temp.next.data == key) {
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
                
            }
            break;
            
        }
        temp = temp.next;
    }
    }
}

public void removeAt(int index){
    if (index == 0) {
        removeFirst();
    }else{
        Node06 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }


        temp.next = temp.next.next;
   
            if (temp.next == null) {
                tail = temp;
                
            }

    }
    
}
}
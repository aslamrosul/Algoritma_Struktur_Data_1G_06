package P10;

public class DoubleLinkedList06 {
    Node06 head;
    int size;
    public DoubleLinkedList06(){
head = null;
size = 0;
    }
boolean isEmpty(){
return head == null;
}
void addFirst(int item){
if (isEmpty()) {
    head = new Node06(null, item, null);
}else{
    Node06 newNode = new Node06(null, item, head);
    head.prev = newNode;
    head = newNode;
}
size ++;
}
void addLast(int item){
if (isEmpty()) {
    addFirst(item);
}else{
    Node06 current = head;
    while (current.next != null) {
        current = current.next;
    }
    Node06 newNode = new Node06 (current, item, null);
    current.next = newNode;
    size ++;
}
}
void add (int item, int index) throws Exception {
    if (isEmpty() ) {
        addFirst(item);
    }else if (index < 0 || index >size) {
        throw new Exception("Nilai indeks di luar batas");
    }else {
        Node06 current = head;
int i = 0;
while (i < index) {
    current = current.next;
    i++;
}
if (current.prev == null) {
    Node06 newNode = new Node06(null, item, current);
    current.prev = newNode;
    head = newNode;
}else {
    Node06 newNode = new Node06(current.prev, item, current);
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev.next = newNode;
    current.prev = newNode;
}
    }
    size++;
}
public int size(){
return size;
}
public void clear(){
head = null;
size = 0;
}
void print(){
    if (!isEmpty()) {
        Node06 tmp= head;
    while (tmp.next != null) {
        System.out.print(tmp.data + "\t");
        tmp = tmp.next;
    }
    System.out.print(tmp.data + "\t");//tambahan code agar yang terakhir bisa dilihat
    System.out.println("\nberhasil diisi");
    } else {
        System.out.println("Linked List Kosong");
    }
}
public void removeFirst() throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
    } else if (size == 1){
    removeLast();
    }else {
        head = head.next;
        head.prev = null;
        size --;
    }
}
public void removeLast() throws Exception{
    if (isEmpty()) {
        throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
    }else if (head.next==null) {
        head=null;
        size--;
        return;
    }
    Node06 current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
    size--;
}
public void remove(int index) throws Exception{
    if (isEmpty() || index >=size) {
        throw new Exception("Nilai indeks di luar batas");

    }else if (index == 0) {
        removeFirst();
    }else {
        Node06 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.next == null) {
            current.prev.next = null;
        }else if (current.prev == null) {
            current = current.next;
            current.prev = null;
            head = current;
        }else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }
}
}

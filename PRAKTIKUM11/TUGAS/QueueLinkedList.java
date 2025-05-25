package TUGAS;

public class QueueLinkedList {
    NodeMahasiswa front, rear;
    int size = 0;
    int kapasitas = 10;


    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= kapasitas;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        NodeMahasiswa newNode = new NodeMahasiswa(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil:");
        front.data.tampilInformasi();
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Isi Antrian:");
        NodeMahasiswa current = front;
        while (current != null) {
            current.data.tampilInformasi();
            System.out.println("-----------");
            current = current.next;
        }
    }
}

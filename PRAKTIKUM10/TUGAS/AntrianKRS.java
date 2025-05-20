package TUGAS;

public class AntrianKRS {
    DataMahasiswa[] data;
    int front, rear, size, max, totalDiproses;

    public AntrianKRS(int n) {
        max = n;
        data = new DataMahasiswa[max];
        front = rear = -1;
        size = totalDiproses = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(DataMahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup untuk 2 mahasiswa.");
            return;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Memproses:");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peek2() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup untuk 2 mahasiswa.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            int next = (front + 1) % max;
            data[next].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            int i = front;
            while (true) {
                data[i].tampilkanData();
                if (i == rear) break;
                i = (i + 1) % max;
            }
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        totalDiproses = 0;
    }

    public int getJumlah() {
        return size;
    }

    public int getJumlahProses() {
        return totalDiproses * 2;
    }

    public int getSisa() {
        return 30 - getJumlahProses();
    }
}

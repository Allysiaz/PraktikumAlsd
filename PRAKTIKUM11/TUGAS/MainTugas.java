package TUGAS;

import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        QueueLinkedList antrian = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("==== Menu Antrian Layanan ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, kelas));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.print();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian belum penuh");
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Jumlah yang mengantre: " + antrian.getSize());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}

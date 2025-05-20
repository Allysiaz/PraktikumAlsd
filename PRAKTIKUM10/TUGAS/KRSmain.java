package TUGAS;
import java.util.Scanner;
public class KRSmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n==== Menu Persetujuan KRS ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses 2 Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah yang Sudah Diproses");
            System.out.println("8. Cek Mahasiswa yang Belum Proses");
            System.out.println("9. Hapus Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();
            switch (pilih) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                        break;
                    }
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Prodi : "); String prodi = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    DataMahasiswa mhs = new DataMahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue2();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.peek2();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlah());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah melakukan proses KRS: " + antrian.getJumlahProses());
                    break;
                case 8:
                    System.out.println("Mahasiswa yang belum KRS: " + antrian.getSisa());
                    break;
                case 9:
                    antrian.clear();
                    System.out.println("Semua antrian telah dihapus.");
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}

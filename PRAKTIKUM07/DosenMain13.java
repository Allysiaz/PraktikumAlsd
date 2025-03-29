package PRAKTIKUM07;
import java.util.Scanner;
public class DosenMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 dataDosen = new DataDosen13();

        while (true) {
            System.out.println("===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Sorting DSC (Usia Tertua ke Termuda - Insertion Sort)");
            System.out.println("6. Cari Dosen (Nama - Sequential)");
            System.out.println("7. Cari Dosen (Usia - Binary)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen   : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen   : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (true=Laki-laki / false=Perempuan): ");
                    boolean jenisKelamin = sc.nextBoolean();
                    System.out.print("Masukkan usia dosen   : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen13 dosenBaru = new Dosen13(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosenBaru);
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("===== DATA DOSEN =====");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("Mengurutkan data dosen berdasarkan usia (ASC)...");
                    dataDosen.sortingASC();
                    System.out.println("Data berhasil diurutkan!");
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("Mengurutkan data dosen berdasarkan usia (DSC - Selection Sort)...");
                    dataDosen.sortingDSC();
                    System.out.println("Data berhasil diurutkan!");
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.println("Mengurutkan data dosen berdasarkan usia (DSC - Insertion Sort)...");
                    dataDosen.insertionSort();
                    System.out.println("Data berhasil diurutkan!");
                    dataDosen.tampil();
                    break;
                
                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaCari = sc.nextLine();
                    dataDosen.PencarianDataSequential13(namaCari);
                    break;

                case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int usiaCari = sc.nextInt();
                    dataDosen.PencarianDataBinary13(usiaCari);
                    break;

                case 8:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}

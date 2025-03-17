import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama mata kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Jadwal Kuliah");
            System.out.println("2. Cari Mata Kuliah");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMK, sks, semester, hariKuliah);
                    break;
                case 2:
                    cariMataKuliah(namaMK, sks, semester, hariKuliah);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nOpsi Tampilan Jadwal:");
        System.out.println("1. Tampilkan Seluruh Jadwal");
        System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
        System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = sc.nextInt();
        sc.nextLine(); // Membersihkan newline

        switch (pilihan) {
            case 1:
                tampilkanSeluruhJadwal(namaMK, sks, semester, hariKuliah);
                break;
            case 2:
                System.out.print("Masukkan hari yang ingin ditampilkan (contoh: Senin): ");
                String hari = sc.nextLine();
                tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah, hari);
                break;
            case 3:
                System.out.print("Masukkan semester yang ingin ditampilkan: ");
                int semesterInput = sc.nextInt();
                tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah, semesterInput);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        sc.close();
    }
    static void tampilkanSeluruhJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-30s %-10s %-10s %-15s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-30s %-10d %-10d %-15s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
        }
    }
    // Fungsi untuk menampilkan jadwal kuliah berdasarkan hari tertentu
    static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-30s %-10s %-10s %-15s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-10d %-10d %-15s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }

    // Fungsi untuk menampilkan jadwal kuliah berdasarkan semester tertentu
    static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int semesterInput) {
        System.out.println("\nJadwal Kuliah Semester " + semesterInput + ":");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-30s %-10s %-10s %-15s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == semesterInput) {
                System.out.printf("%-30s %-10d %-10d %-15s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }

    // Fungsi untuk mencari dan menampilkan informasi mata kuliah
    static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String namaCari = sc.nextLine();

        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(namaCari)) {
                System.out.println("\nInformasi Mata Kuliah:");
                System.out.println("Nama Mata Kuliah: " + namaMK[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari Kuliah: " + hariKuliah[i]);
                return;
            }
        }

        System.out.println("Mata kuliah tidak ditemukan.");
 sc.close();
}
}

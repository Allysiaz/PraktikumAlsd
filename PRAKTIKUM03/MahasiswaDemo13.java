package PRAKTIKUM03;
import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa13[] arrayofMahasiswa = new Mahasiswa13[2];
        String dummy;

        for (int i = 0; i < 2; i++) {
            arrayofMahasiswa[i] = new Mahasiswa13();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayofMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayofMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayofMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");
        }
        for (int i = 0; i < arrayofMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i +1));
            arrayofMahasiswa[i].cetakInfo();
        }
        sc.close();
    }
}
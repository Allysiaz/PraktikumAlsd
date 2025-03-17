package PRAKTIKUM03;
import java.util.Scanner;
public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen13 [] arrayOfDosen = new Dosen13[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                  : ");
            String kode = sc.nextLine();
            System.out.print("Nama                  : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P)   : ");
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia                  : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------------");
            arrayOfDosen[i] = new Dosen13(kode, nama, jenisKelamin, usia);
        }
            System.out.println("======== Data Semua Dosen ========");
        for (Dosen13 dosen : arrayOfDosen) {
            System.out.println("Kode            : "+ dosen.kode);
            System.out.println("Nama            : "+ dosen.nama);
            System.out.println("Jenis Kelamin   : "+ (dosen.jenisKelamin? "Pria" : "Wanita"));
            System.out.println("Usia            : "+ dosen.usia);
            System.out.println("---------------------------------");
        }
        DataDosen13 dataDsn = new DataDosen13();
        dataDsn.dataSemuaDosen(arrayOfDosen);
        dataDsn.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDsn.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDsn.infoDosenPalingTua(arrayOfDosen);
        dataDsn.infoDosenPalingMuda(arrayOfDosen);
        sc.close();
    }
}

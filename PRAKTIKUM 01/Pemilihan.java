import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("==================================");
        System.out.println("==================================");
        
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);

        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String ket = (nilaiHuruf == "D" || nilaiHuruf == "E") ? "MAAF ANDA TIDAK LULUS" : "SELAMAT ANDA LULUS";

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println(ket);
        System.out.println("==================================");
        System.out.println("==================================");
     
        sc.close();
    }
}
import java.util.Scanner;
public class Array {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        System.out.print("Masukkan banyak Mata Kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();

        String[] matKul = new String[jmlMatkul];
        double [] nilaiAngka = new double[jmlMatkul];
        String [] nilaiHuruf = new String[jmlMatkul];
        double [] bobotNilai = new double[jmlMatkul];
        int [] sks = new int[jmlMatkul];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan nama Mata Kuliah: ");
            matKul[i] = sc.nextLine();
           
            System.out.print("Masukkan nilai untuk MK " + matKul[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            System.out.print("Masukkan bobot SKS untuk MK " + matKul[i] + " : ");
            sks[i] = sc.nextInt();
            sc.nextLine();
        
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }

        }
        System.out.println("===============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-20s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf("%-20s %-12.2f %-12s %-12.2f\n", matKul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        double totalNilai = 0;
        int totalSks = 0;
        for (int i = 0; i < jmlMatkul; i++) {
            totalNilai += bobotNilai[i] * sks[i];
            totalSks += sks[i];
        }
       
        System.out.println("===============================");
        double ip = totalNilai/totalSks;
        System.out.println("IP : " + ip);

        sc.close();
    }
}

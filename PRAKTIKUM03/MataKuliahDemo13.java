package PRAKTIKUM03;
import java.util.Scanner;
public class MataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        MataKuliah13[] arrayOfMataKuliah = new MataKuliah13[jmlMatkul];
    
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah13();
            arrayOfMataKuliah[i].tambahData("", "", 0, 0);;
            System.out.print("Kode       : ");
            arrayOfMataKuliah[i].kode=sc.nextLine();
            System.out.print("Nama       : ");
            arrayOfMataKuliah[i].nama=sc.nextLine();
            System.out.print("SKS        : ");
            arrayOfMataKuliah[i].sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            arrayOfMataKuliah[i].jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------------------");
           

        }
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i +1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
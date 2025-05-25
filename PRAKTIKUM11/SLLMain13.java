import java.util.Scanner;
public class SLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList13 sll = new SingleLinkedList13();
        
        System.out.println("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jmlMahasiswa = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   :");
            String nim = sc.nextLine();
            System.out.print("Nama  :");
            String nama = sc.nextLine();
            System.out.print("Kelas :");
            String kelas = sc.nextLine();
            System.out.print("IPK   :");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            System.out.println();
        }
        sll.print();

        System.out.println("Data index 1: ");
        sll.getData(1);

        System.out.println("Data Mahasiswa An Bimon berada pada Index: " +sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

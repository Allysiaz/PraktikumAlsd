import java.util.Scanner;
public class SuratDemo {
    public static void main(String[] args) {
        StackSurat13 stackSurat = new StackSurat13(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String nama = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I/KL): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi Izin: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat13 sr = new Surat13(nim, nama, kelas, jenisIzin, durasi);
                    
                    stackSurat.push(sr);;
                    System.out.printf("Surat %s berhasil dimasukkan.\n", sr.namaMahasiswa);
                    break;
            
                case 2:
                    Surat13 suratTerproses = stackSurat.pop();
                    if (suratTerproses != null) {
                        System.out.println("Memproses surat izin dengan ID: " + suratTerproses.idSurat);
                    }
                    break;
                
                case 3:
                    Surat13 suratTerakhir = stackSurat.peek();
                    if (suratTerakhir != null) {
                        System.out.println("\nSurat Izin Terakhir:");
                        System.out.println(suratTerakhir.namaMahasiswa + "\t" + suratTerakhir.kelas + "\t" + suratTerakhir.jenisIzin + "\t" + suratTerakhir.durasi);
                    }
                    break;
                
                case 4:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String dicari = scan.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i <= stackSurat.top; i++) {
                        if (stackSurat.stack[i].namaMahasiswa.equalsIgnoreCase(dicari)) {
                            System.out.println("Surat " + stackSurat.stack[i].namaMahasiswa + " Ditemukan");
                            System.out.println(stackSurat.stack[i].idSurat + "\t" + stackSurat.stack[i].namaMahasiswa +"\t"+ stackSurat.stack[i].kelas +"\t"+ stackSurat.stack[i].jenisIzin +"\t"+ stackSurat.stack[i].durasi);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Surat dari " + dicari + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    scan.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            
        } while (pilih >= 1 && pilih <= 4);
    }
}

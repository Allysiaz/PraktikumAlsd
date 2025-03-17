import java.util.Scanner;
public class KodePlat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        System.out.print("Masukkan kode plat nomor (huruf kapital): ");
        char kodeInput = Character.toUpperCase(sc.next().charAt(0));

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == kodeInput) {
                ditemukan = true;
                System.out.print("Nama kota: ");
                for (char huruf : kota[i]) { // Perbaikan: gunakan KOTA[i]
                    System.out.print(huruf);
                }
                System.out.println();
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class Kubus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();
        sc.nextLine();

        int pilihan;
        do { 
        menu();
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                volumeKubus(sisi);
                break;
            case 2:
                luasKubus(sisi);  
                break;
            case 3:
                kelilingKubus(sisi);
                break;
            case 4:
                System.out.println("Keluar dari Program.");
                System.out.println();
                break;
            default:
                System.out.println("Pilihan tidak Valid.");
                System.out.println();
        }
        } while (pilihan !=4); 
        sc.close();   
    }

    public static void menu (){
        System.out.println("============= MENU ==============");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.println("=================================");
    }

    public static void volumeKubus(int sisi){
        int volume = sisi*sisi*sisi;
        System.out.println("Volume Kubus adalah: " + volume);
        System.out.println();
    }

    public static void luasKubus(int sisi){
        int luas = 6*sisi*sisi;
        System.out.println("Luas Permukaan Kubus adalah: " + luas);
        System.out.println();
    }

    public static void kelilingKubus(int sisi){
        int keliling = 12*sisi;
        System.out.println("Keliling Kubus adalah: " + keliling);
        System.out.println();
    }
}

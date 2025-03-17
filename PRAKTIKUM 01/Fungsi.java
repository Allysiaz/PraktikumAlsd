import java.util.Scanner;;
public class Fungsi {
    
    static int aglonema = 75000;
    static int keladi = 50000;
    static int alocasia = 60000;
    static int mawar = 10000;

    static int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9} 
    };

    static int[] penguranganStok = {1, 2, 0, 5}; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("Jumlah stok bunga di semua cabang RoyalGarden: ");
        System.out.println("======================================================");

        pendapatanStokHabis();
        System.out.println("======================================================");
        menampilkanStok();
        sc.close();
    }

    public static void pendapatanStokHabis() {
        for (int i = 0; i < stok.length; i++) {
            int total = (stok[i][0] * aglonema) + (stok[i][1] * keladi) + (stok[i][2] * alocasia) + (stok[i][3] * mawar);
            System.out.println("Total pendapatan jika  habis terjual cabang " + (i + 1) + ": " + total);
        }
    }

    public static void menampilkanStok() {
        System.out.println("======================================================");
        System.out.println("Stok bunga di cabang ke-4:");
        System.out.println("Aglonema  : " + stok[3][0]);
        System.out.println("Keladi    : " + stok[3][1]);
        System.out.println("Alocasia  : " + stok[3][2]);
        System.out.println("Mawar     : " + stok[3][3]);
        System.out.println("======================================================");

        for (int i = 0; i < stok[3].length; i++) {
            stok[3][i] -= penguranganStok[i];
        }
        System.out.println("======================================================");

        System.out.println("Stok bunga di cabang ke-4 setelah di update:");
        System.out.println("Aglonema  : " + stok[3][0]);
        System.out.println("Keladi    : " + stok[3][1]);
        System.out.println("Alocasia  : " + stok[3][2]);
        System.out.println("Mawar     : " + stok[3][3]);
        System.out.println("======================================================");
       
        
    }
}

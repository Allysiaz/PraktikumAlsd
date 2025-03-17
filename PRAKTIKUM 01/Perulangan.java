import java.util.Scanner;
public class Perulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        int nim = sc.nextInt();
        System.out.println("==========================");

        int n = nim % 100;

        if (n < 10) {
            n += 10;
        }

        System.out.print("n: " + n + "\n");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print(" * ");
            }
        }
    sc.close();
    }
}

import java.util.Scanner;
public class Lingkaran20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        int r;
        float phi = 3.14F;
        double keliling, luas;

        System.out.println("Masukkan jari jari lingkaran: ");
        r = sc20.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println("Kelilingnya adalah: "+ keliling);
        System.out.println("Luasnya adalah: "+ luas);
    }
}

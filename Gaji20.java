import java.util.Scanner;
public class Gaji20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTidakMasuk, totGaji, gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Kerja: ");
        jmlTidakMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Gaji Perhari: ");
        gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji Perhari");
        potGaji = input.nextInt();

        totGaji = (jmlMasuk*gaji)-(jmlTidakMasuk*potGaji);

        System.out.println("Gaji Anda Adalah: " + totGaji);
    }
}

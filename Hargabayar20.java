import java.util.Scanner;

public class Hargabayar20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merekBuku;
        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan nama merek buku: ") ;
        merekBuku = input.nextLine();
        System.out.println("Masukkan halaman buku: ");
        halBuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah diskon yang didapat: ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Merek buku: "+ merekBuku);
        System.out.println("Halaman buku: "+ halBuku);
        System.out.println("Diskon yang anda dapatkan adalah "+ jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: "+ bayar);
        
    }
}

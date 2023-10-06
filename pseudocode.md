PSEUDOCODE
Algoritma: Hargabayar17
{dibaca harga barang, jumlah barang, nama merek, jumlah halaman dan
jumlah diskon dari piranti masukkan. Hitunglah jumlah diskon dan harga
total barang}
Deklrasi:
merekBuku: String
harga, jumlah, halBuku: int
dis, total, bayar, jmlDis: double
Deskripsi:
1. Print “Masukkan nama merek buku”
2. Read merekBuku
3. Print “Masukkan jumlah halaman buku”
4. Read halBuku
5. Print "Masukkan harga barang yang dibeli”
6. Read harga
7. Print " Masukkan Jumlah jumlah barang yang dibeli”
8. Read jumlah
9. Print “Masukkan Diskon yang didapat”
10. Read dis
11. total = harga *jumlah
12. jmlDis=total*dis
13. bayar=total-jmlDis
14. Print bayar
15. Print namaMerekBuku
16. Print halBuku
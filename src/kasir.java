import java.util.Scanner;

/**
 *kelas kasir ini digunakan untuk sistem kasir sederhana
 * program ini untuk menampilkan daftar barang, harga dan harga masing masing
 * program ini menerima input jumlah dan jenis barang yanh dibeli dan menghitung barang total belanja
 * menghitung kembalian jika uang yang dibayarkan lebih dari atau sama dengan total belanja
 * royyy
 */

public class kasir {
    /**
     * metode utama program untuk menjalankan sistem kasir
     * @param args argumen baris perintah
     */

    public static void main(String[] args) {//paraameter
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI TOKO DHURO😍");
        String[] barang = {"Beras", "Minyak", "Gula", "Telur", "Susu"};
        int[] harga = {12000, 14000, 9000, 1500, 10000};

        int totalBelanja = 0;

        System.out.println("Daftar Barang:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println((i + 1) + ". " + barang[i] + " - Rp " + harga[i]);
        }

        System.out.print("Berapa jenis barang yang akan dibeli? ");
        int jumlahBarang = input.nextInt();

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Pilih nomor barang yang akan dibeli: ");
            int pilihanBarang = input.nextInt();

            System.out.print("Masukkan jumlah " + barang[pilihanBarang - 1] + " yang dibeli: ");
            int jumlah = input.nextInt();

            int totalHargaBarang = harga[pilihanBarang - 1] * jumlah;
            totalBelanja += totalHargaBarang;
        }

        System.out.println("Total belanja: Rp " + totalBelanja);

        System.out.print("Masukkan jumlah uang yang dibayar: Rp ");
        int uangDibayar = input.nextInt();

        int kembalian = uangDibayar - totalBelanja;

        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp " + kembalian);
        } else {
            System.out.println("Uang tidak cukup!");
        }

        // Menutup scanner
        input.close();
    }
}

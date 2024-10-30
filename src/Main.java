import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {

    public static final int[] HARGA = {12000, 14000, 9000, 1500, 10000};

    public static void main(String[] args, BiConsumer<String[], int[]> biConsumer) {
        Scanner input = new Scanner(System.in);

        String[] barang = {"Beras", "Minyak", "Gula", "Telur", "Susu"};
        int[] harga = HARGA;//2.constanta

        int jumlahBeli = 0;//4.rename

        biConsumer.accept(barang, harga);

        System.out.print("Berapa jenis barang yang akan dibeli? ");
        //1.inline

        jumlahBeli = tampilkanDaftarBaang(input, barang, harga, jumlahBeli);

        System.out.println("Total belanja: Rp " + jumlahBeli);

        System.out.print("Masukkan jumlah uang yang dibayar: Rp ");
        int uangDibayar = input.nextInt();

        int kembalian = uangDibayar - jumlahBeli;

        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp " + kembalian);
        } else {
            System.out.println("Uang tidak cukup!");
        }

        input.close();
    }

    private static int tampilkanDaftarBaang(Scanner input, String[] barang, int[] harga, int totalBelanja) {
        for (int i = 0; i < input.nextInt(); i++) {//3.metod
            System.out.print("Pilih nomor barang yang akan dibeli: ");
            int pilihanBarang = input.nextInt();

            System.out.print("Masukkan jumlah " + barang[pilihanBarang - 1] + " yang dibeli: ");
            int jumlah = input.nextInt();

            int totalHargaBarang = harga[pilihanBarang - 1] * jumlah;
            totalBelanja += totalHargaBarang;
        }
        return totalBelanja;
    }
}
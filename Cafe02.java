import java.util.Scanner;

import java.util.Scanner;

public class Cafe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;
        int totalItemPelanggan = 0;
        int totalItemCabang;
        int cabang;
        int jumlahCabang;

        System.out.print("Jumlah cabang cafe : ");
        jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan per Cabang ===");

        for (cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\n--- Cabang " + cabang + " ---");
            System.out.print("Jumlah Pelanggan : ");
            int jumlahPelanggan = sc.nextInt();

            totalItemCabang = 0;

            for (int Pelanggan = 1; Pelanggan <= jumlahPelanggan; Pelanggan++) {
                System.out.print("- Pelanggan " + Pelanggan + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }

            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan : " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual : " + totalItemCabang + " item");

            totalSeluruhPelanggan += jumlahPelanggan;
            totalSeluruhItem += totalItemCabang;
        }

        System.out.println("\n Total seluruh Cabang");
        System.out.println("- Pelanggan : " + totalSeluruhPelanggan + " orang");
        System.out.println("- Item terjual : " + totalSeluruhItem + " item");

        sc.close();

    }
    
}

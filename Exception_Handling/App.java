import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nama;
        String namaBarang;
        String kodeBarang;
        String Alamat;
        Integer hargaBarang = 0;
        Integer jumlahBeli = 0;
        int check = 1;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        Scanner angka2 = new Scanner(System.in);

        System.out.print("Nama Pelanggan : ");
        nama = input.nextLine();

        System.out.print("Nama Barang : ");
        namaBarang = input.next();

        System.out.print("Kode Barang : ");
        kodeBarang = input.next();
        
        System.out.print("Alamat : ");
        Alamat = input2.nextLine();

            do{
                try {
                    System.out.print("Harga Barang   : ");
                    hargaBarang = angka.nextInt();
                    check = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    angka.next();}
                }while(check!=0);
        check = 1;

            do{
                try {
                    System.out.print("Jumlah Beli    : ");
                    jumlahBeli = angka2.nextInt();
                    check = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    angka2.next();}
                }while(check!=0);
        Penjualan penjualan1 = new Penjualan(nama, namaBarang, hargaBarang, jumlahBeli, kodeBarang, Alamat);
    }
}

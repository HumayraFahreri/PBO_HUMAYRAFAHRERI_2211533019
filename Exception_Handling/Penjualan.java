public class Penjualan extends Pelanggan {
    public String nomorFaktur;
    public String namaBarang;
    public Integer hargaBarang;
    public Integer jumlahBeli;
    public Integer totalBayar;
    public String kodeBarang;
    public String Alamat;
    public static Integer faktur = 0;

    public Penjualan(String nama, String namaBarang, Integer hargaBarang, Integer jumlahBeli, String kodeBarang, String Alamat){
        super(nama, Alamat);
        //this.nomorFaktur = nomorFaktur;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
        this.totalBayar = hargaBarang * jumlahBeli;
        this.kodeBarang = kodeBarang;
        this.Alamat = Alamat;

        cetakFaktur();
    }

    @Override
    public void cetakFaktur(){
        /*System.out.println("==============================");
        System.out.println("Supermarket Ubi Taro");
        System.out.println("SMBI" + ++faktur);
        System.out.println("==============================");
        System.out.println("Pembeli: " + nama);
        System.out.println("HP: " + noHp);
        System.out.println("------------------------------");
        System.out.println( );
        System.out.println (namaBarang);
        System.out.print("Rp." + hargaBarang + " * " + jumlahBeli + " = " + totalBayar);
        System.out.println( );
        System.out.println("------------------------------");
        System.out.println( );
        System.out.println("TOTAL BELANJA : " + totalBayar);
        System.out.println( );
        System.out.println("------------------------------");
        System.out.println("THANK YOU");*/

        System.out.println(" ");
        System.out.println("SUPERMARKET UBI TARO");
        System.out.println("==============================");
        System.out.println("DATA PELANGGAN");
        System.out.println("------------------------------");
        System.out.println("Nama Pelanggan :" + nama);
        System.out.println("Alamat :" + Alamat);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------");
        System.out.println("Kode Barang :" + kodeBarang);
        System.out.println("Nama Barang :" + namaBarang);
        System.out.println("Harga Barang :" + hargaBarang);
        System.out.println("Jumlah Beli :" + jumlahBeli);
        System.out.println("TOTAL BAYAR :" + totalBayar);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Kasir : Agung Prasetyo");
    }
}
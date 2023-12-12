public class Elemen{
    private String nama;
    public Integer jamSibuk;
    public String profesi;
    public static Integer jumlahJamSibuk=0;

    public Elemen(String nama, String profesi, Integer jamSibuk){
        this.nama = nama;
        this.jamSibuk = jamSibuk;
        this.profesi = profesi;
        jumlahJamSibuk+=jamSibuk;
    }
    public void getJamSibuk(String nama){
        System.out.println(nama + " adalah seorang " + profesi + " dengan jam sibuk " + jamSibuk);
    }

}
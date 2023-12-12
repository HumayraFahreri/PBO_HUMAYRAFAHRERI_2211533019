public class Dosen extends Elemen {
    public Dosen(String nama, Integer jamSibuk) {
        super(nama, "Dosen", jamSibuk*8);
        super.getJamSibuk(nama);
    }
    private Integer jumlahHariKerja;
    public Integer getJamSibuk(){
        return 0;
    }
}



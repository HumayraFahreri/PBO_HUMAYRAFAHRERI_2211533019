public class Mahasiswa extends Elemen{
    private Integer sks;

    public Mahasiswa(String nama, Integer sks){
        super(nama, "Mahasiswa", sks * 3);
        super.getJamSibuk(nama);
    }
    public Mahasiswa(String nama, Integer sks, Integer bonus){
        super(nama, "Asdos",sks*3+bonus);
    }

}
public class Asdos extends Mahasiswa{
    private Integer jamNgasdos;

    public Asdos(String nama, Integer sks, Integer jamNgasdos) {
        super(nama, sks ,jamNgasdos);
        super.getJamSibuk(nama);
    }
}

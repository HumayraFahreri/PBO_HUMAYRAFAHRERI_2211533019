public class simulator {
    public static void main (String[] args){
        Asdos asdos = new Asdos("Fairuzikun", 22, 7); 
        
        Dosen guru = new Dosen("Raja OP Damanik", 5);
        
        Asdos asdos1 = new Asdos("Angel-chan", 20, 4); 
        
        Mahasiswa mhs = new Mahasiswa("Firman", 20);   
        
        Mahasiswa mhs1 = new Mahasiswa("Nid to pass this sem", 23); 
        
        Dosen guru1 = new Dosen("Nivotko", 3);

        System.out.println("Total jam sibuk elemen Fasilkom adalah " + Elemen.jumlahJamSibuk);
    }
}

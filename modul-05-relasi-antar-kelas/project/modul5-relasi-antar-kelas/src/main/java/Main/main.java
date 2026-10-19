package Main;
import guided.agregasi.Jurusan;
import guided.agregasi.Mahasiswa;
import guided.komposisi.Komputer;

public class main {
    public static void main(String[] args) {
        runGuided2();
        runGuided3();
    }

    public static void runGuided2() {
        Mahasiswa m1 = new Mahasiswa("103132400027", "Aditya");
        Mahasiswa m2 = new Mahasiswa("103132400028", "belang");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();
    }


    public static void runGuided3(){
        Komputer pc = new Komputer("Intel Core i5",3200,"LG 24 Inch","Logitech","Wireless");
        pc.displaySpecKomputer();
    }
}

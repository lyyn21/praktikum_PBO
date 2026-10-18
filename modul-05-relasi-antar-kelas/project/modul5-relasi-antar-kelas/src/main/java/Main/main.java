package Main;
import guided.agregasi.Jurusan;
import guided.agregasi.Mahasiswa;

public class main {
    public static void main(String[] args) {
        runGuided2();
    }

    public static void runGuided2() {
        Mahasiswa m1 = new Mahasiswa("103132400027", "Aditya");
        Mahasiswa m2 = new Mahasiswa("103132400028", "belang");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();
    }
}

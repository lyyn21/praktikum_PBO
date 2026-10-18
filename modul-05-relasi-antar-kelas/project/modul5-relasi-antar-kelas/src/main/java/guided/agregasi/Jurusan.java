package guided.agregasi;

public class Jurusan {
    private static int jumlahMahasiswa;
    private String kodeJurusan;
    private String namaJurusan;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];

    // constructor
    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    // behavior
    public void addMahasiswa(Mahasiswa m) {
        this.daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    }

    public void displayMahasiswa() {
        System.out.println("Kode Jurusan " + this.kodeJurusan);
        System.out.println("Nama Jurusan " + this.namaJurusan);
        
        System.out.println("Daftar Mahasiswa : ");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println((i + 1) + ". " + daftarMahasiswa[i].getNIM() + " " + daftarMahasiswa[i].getNama());
        }
    }

    // getter
    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    // setter
    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
}

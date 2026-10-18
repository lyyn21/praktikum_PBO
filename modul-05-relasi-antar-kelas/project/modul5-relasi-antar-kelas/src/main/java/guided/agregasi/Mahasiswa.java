package guided.agregasi;

public class Mahasiswa {
    private String NIM;
    private String nama;

    public Mahasiswa(String NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    // getter
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    // setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

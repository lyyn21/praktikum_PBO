package guided.komposisi;

public class CPU {
    private String merk;
    private int kecepatan;

    public CPU(String m, int k) {
        this.merk = m;
        this.kecepatan = k;
    }

    public void DisplaySpecCPU() {
        System.out.println(this.merk + ", " + this.kecepatan);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

import java.util.Locale;

public class PengolahSuhu {

   
    private static final double NILAI_KOSONG = -1.0;
    private static final int TIDAK_DITEMUKAN = -1;

 
    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {

        this.suhuHarian = suhuHarian;
    }

    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.printf("Hari %d : %s%n", i + 1, formatSuhu(suhuHarian[i]));
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return TIDAK_DITEMUKAN;
    }

    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != TIDAK_DITEMUKAN) {
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }

    private String formatSuhu(double suhu) {
        if (suhu == NILAI_KOSONG) {
            return "(kosong)";
        }
        return String.format(Locale.US, "%.1f C", suhu);
    }
}

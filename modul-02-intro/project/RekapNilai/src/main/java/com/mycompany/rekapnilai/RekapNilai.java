/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rekapnilai;

/**
 *
 * @author Aditya
 */
public class RekapNilai {
    public static void main(String[] args) {
        // Deklarasi konstanta KKM menggunakan keyword final
        final double KKM = 75.0;
        
        // Array 1 Dimensi untuk menyimpan nama 3 mahasiswa
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};
        
        // Array 2 Dimensi Rectangular untuk menyimpan dua nilai modul tiap mahasiswa
        double[][] nilaiModul = {
            {80.0, 85.0}, // Nilai Andi
            {70.0, 65.0}, // Nilai Budi
            {90.0, 90.0}  // Nilai Citra
        };
        
        // Menampilkan Header
        System.out.println("REKAP NILAI");
        System.out.println("PRAKTIKUM\n");
        System.out.println("KKM: " + KKM + "\n");
        
        // Perulangan untuk mengakses array dan menghitung rata-rata
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1: " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2: " + nilaiModul[i][1]);
            
            // Perhitungan rata-rata
            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2.0;
            System.out.println("Rata-rata : " + rataRata);
            
            // Percabangan untuk mengevaluasi status kelulusan
            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }
            
            System.out.println("Status : " + status + "\n");
        }
    }
}

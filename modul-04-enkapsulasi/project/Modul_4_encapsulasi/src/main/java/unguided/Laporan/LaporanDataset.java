/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.Laporan;

import java.util.Locale;
import unguided.model.Dataset;

public class LaporanDataset {

    public static void cetak(Dataset d) {
        String status = d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";

        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama : " + d.getNama());
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.println(String.format(Locale.US, "Missing : %d sel (%.2f%%)",
                d.getJumlahMissing(), d.getPersentaseMissing()));
        System.out.println("Status : " + status);
        System.out.println();
    }
}

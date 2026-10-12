/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.Main;

import unguided.Laporan.LaporanDataset;
import unguided.model.Dataset;

public class Main {

    public static void main(String[] args) {
      
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        
        Dataset d2 = new Dataset("Wine Quality");

        
        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        
        Dataset[] daftar = {d1, d2, d3};
        for (Dataset d : daftar) {
            LaporanDataset.cetak(d);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}

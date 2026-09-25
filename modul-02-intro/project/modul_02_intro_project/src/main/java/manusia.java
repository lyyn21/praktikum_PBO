/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditya
 */
public class manusia {

    private String nama;
    private int tinggi;

    void setInfo(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    void info() {
        System.out.println(this.nama + " Memiliki Tinggi " + this.tinggi
                + "cm");
    }
}

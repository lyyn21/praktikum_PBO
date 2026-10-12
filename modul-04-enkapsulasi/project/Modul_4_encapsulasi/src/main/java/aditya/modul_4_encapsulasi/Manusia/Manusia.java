/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aditya.modul_4_encapsulasi.Manusia;

public class Manusia {

    private String nama;
    private int umur;
//definisi constructor

    public Manusia() {
    } //constructor pertama = default tanpa parameter

    public Manusia(String a) { //constructor kedua
        nama = a;
    }

    public Manusia(String a, int b) { //constructor ketiga
        nama = a;
        umur = b;
    }
//definisi Method

    public void setNama(String a) {
        nama = a;
    }
    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}

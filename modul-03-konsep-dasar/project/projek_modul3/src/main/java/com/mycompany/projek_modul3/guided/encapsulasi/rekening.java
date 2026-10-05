/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projek_modul3.guided.encapsulasi;


public class rekening {
    private int saldo = 0;
    
    public void tambahsaldo(int jumlah){
        saldo = saldo + jumlah;
        System.out.println("saldo berhasil ditambahkan");
    }
    
    public void tampilkansaldo(){
        System.out.println("saldo anda: "+ saldo);
    }
}

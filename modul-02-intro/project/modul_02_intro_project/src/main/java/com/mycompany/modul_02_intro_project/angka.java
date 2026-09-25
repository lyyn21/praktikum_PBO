/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul_02_intro_project;

/**
 *
 * @author Aditya
 */
public class angka {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }
        i = 1;
        while (i <= 10) {
            System.out.println(Integer.toString(i));
            i++;
        }
        i = 1;
        do {
            System.out.println(Integer.toString(i));
            i++;
        } while (i <= 10);
    }
}

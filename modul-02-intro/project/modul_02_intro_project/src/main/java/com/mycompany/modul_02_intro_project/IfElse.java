/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul_02_intro_project;

/**
 *
 * @author Aditya
 */
class IfElse {

    public static void main(String args[]) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Dingin";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Semi";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Panas";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Gugur";
        } else {
            season = "";
        }
        System.out.println("Bulan April masuk musim " + season + ".");
    }
}

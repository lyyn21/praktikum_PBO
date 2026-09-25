/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditya
 */
public class GuidedOperator {

    public static void main(String[] args) {
        // 1. Assignment (=) & Aritmatika (+, -, *, /, %)
        int a = 10;
        int b = 3;
        int jumlah = a + b;
        int sisaBagi = a % b;

        // 2. Increment (++) & Decrement (--)
        a++;
        b--;

        // 3. Shortcut Assignment (+=, *=, dll)
        jumlah += 5;

        // 4. Relasional (>, ==, !=, dll) -> menghasilkan boolean
        boolean apakahLebihBesar = a > b;
        boolean apakahSama = a == b;

        // 5. Kondisional / Boolean (&&, ||, !)
        boolean logikaAnd = (a > 5) && (b < 5);
        boolean logikaNegasi = !apakahSama;

        // Output Hasil
        System.out.println("Aritmatika (10 + 3) : " + (a + b - 1));
        System.out.println("Sisa Bagi (10 % 3)  : " + sisaBagi);
        System.out.println("Shortcut (13 + 5)   : " + jumlah);
        System.out.println("Relasional (a > b)  : " + apakahLebihBesar);
        System.out.println("Kondisional (&&)    : " + logikaAnd);
        System.out.println("Negasi (!)          : " + logikaNegasi);
    }
}

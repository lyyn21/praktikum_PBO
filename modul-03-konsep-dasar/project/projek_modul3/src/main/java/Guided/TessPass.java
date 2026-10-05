/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

class TestPass {

    int i, j;

    TestPass(int a, int b) {
        i = a;
        j = b;
    }
//passed by value dengan parameter berupa tipe data primitif

    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }
//passed by reference dengan berupa tipe data class

    void calculate(TestPass e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
    }
}

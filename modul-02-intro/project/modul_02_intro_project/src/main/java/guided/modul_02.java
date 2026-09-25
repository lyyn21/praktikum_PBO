/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided;

/**
 *
 * @author Aditya
 */

public class modul_02 {
    public static void main(String[] args) {

          // cara 1
        int[] varArray1;
        varArray1 = new int[5];
        varArray1[0] = 11;
        varArray1[1] = 22;
        varArray1[2] = 33;

        // cara 2
        int[] varArray2 = new int[5];

        // cara 3
        int[] varArray3 = {1, 2, 3, 4, 5};

        System.out.println(varArray1[3]);

        // array 2 dimensi
        // 10 20
        // 30 40

        int[][] arr2d = new int[2][2];
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        arr2d[1][0] = 30;
        arr2d[1][1] = 40;

        System.out.println("Nilai baris 1 kolom 2: " + arr2d[0][1]);
    }
}


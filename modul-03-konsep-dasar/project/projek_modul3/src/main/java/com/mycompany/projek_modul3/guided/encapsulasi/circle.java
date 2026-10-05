/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projek_modul3.guided.encapsulasi;


public class circle {
    public static final double pi = 3.14159;
    
    public static double radiansTodegree(double rads){
        return rads * 100/pi;
    }
    
    public double r;
    
    public double area(){
        return pi * r * r;
    }
    
    public double circumference() {
        return 2 * pi * r;
    }
}

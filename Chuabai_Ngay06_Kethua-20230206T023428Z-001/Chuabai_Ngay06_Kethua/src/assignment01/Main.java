/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment01;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Triangle trg = new Triangle();
        trg.nhap();
        trg.perimeter();
        trg.area();
        trg.hienthi();
        Triangle eTrg = new ETriangle();
        eTrg.nhap();
        eTrg.perimeter();
        eTrg.area();
        eTrg.hienthi();
    }
}

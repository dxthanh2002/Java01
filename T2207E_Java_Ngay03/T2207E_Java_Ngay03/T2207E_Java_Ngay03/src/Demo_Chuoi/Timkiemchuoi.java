/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Chuoi;

/**
 *
 * @author Admin
 */
public class Timkiemchuoi {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bc";
        int i; 
        i = s1.indexOf(s2); //tìm thấy s2 trong s1 tại i = 1
        s1 = "abcd";
        s2 = "ab";
        i = s1.indexOf(s2);//tìm thấy s2 tại vị trí i =0 trong s1
        s1 = "abcd";
        s2 = "xy";
        i = s1.indexOf(s2);//i=-1 => s2 không có trong s1
    }
}

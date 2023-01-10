/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo02_ReNhanh;

/**
 *
 * @author Admin
 */
public class Vidu_switch_case {
    enum Xeploai {truot, trungbinh, kha, gioi}
    public static void main(String[] args) {
        Xeploai xl = Xeploai.truot;
        switch (xl) {
            case truot:
                System.out.println("Trượt");
                break;
            case trungbinh:
                System.out.println("Trung bình");
                break;
            case kha:
                System.out.println("Khá");
                break;
            case gioi:
                System.out.println("Giỏi");
                break;
            default:
                System.out.println("Không rõ");
        }
    }
}

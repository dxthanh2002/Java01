/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo04_LocalClass;

/**
 *
 * @author Admin
 */
public class LocalInner1 {
    private int data = 30;// biến instance
    void display() {
        //Nested Local class
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
 
    public static void main(String args[]) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }
}

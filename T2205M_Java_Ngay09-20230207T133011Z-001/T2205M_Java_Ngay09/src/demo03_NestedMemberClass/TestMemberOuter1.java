/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo03_NestedMemberClass;

/**
 *
 * @author Admin
 */
public class TestMemberOuter1 {
    private int data;
    public TestMemberOuter1() {
        data = 30;
    }
    //Nested Member Class
    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }
 
    public static void main(String args[]) {
        TestMemberOuter1 objOuter = new TestMemberOuter1();
        TestMemberOuter1.Inner objInner = objOuter.new Inner();
        objInner.msg();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Giang8692
 */
public class ComplexDemo {
  public static void main(String[] args) {
    Complex c1 = new Complex(3, 4);
    Complex c2 = new Complex
        (5, 6);
    
    System.out.println("Complex number 1: " + c1);
    System.out.println("Complex number 2: " + c2);
    
    Complex sum = c1.add(c2);
    System.out.println("Sum of complex numbers: " + sum);
    
    Complex difference = c1.subtract(c2);
    System.out.println("Difference of complex numbers: " + difference);
    
    Complex product = c1.multiply(c2);
    System.out.println("Product of complex numbers: " + product);
    
    Complex quotient = c1.divide(c2);
    System.out.println("Quotient of complex numbers: " + quotient);
    
    c1.setRealPart(10);
    c1.setImaginaryPart(20);
    System.out.println("Complex number 1 after modification: " + c1);
  }
}

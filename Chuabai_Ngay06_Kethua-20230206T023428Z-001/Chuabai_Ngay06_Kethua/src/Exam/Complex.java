/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Complex {
    public double realPart;
    public double imaginaryPart;
    
    public Complex() {
    this.realPart = 0;
    this.imaginaryPart = 0;
  }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    
    // cong hai so thuc
  public Complex add(Complex otherNumber) {
    double c = this.realPart + otherNumber.realPart;
    double z = this.imaginaryPart + otherNumber.imaginaryPart;
    return new Complex(c, z);
  }
  
  // tru hai so thuc
  public Complex subtract(Complex otherNumber) {
    double c = this.realPart - otherNumber.realPart;
    double z = this.imaginaryPart - otherNumber.imaginaryPart;
    return new Complex(c, z);
  }
  
  // nhan hai so thuc
  public Complex multiply(Complex otherNumber) {
    double c = (this.realPart * otherNumber.realPart) - (this.imaginaryPart * otherNumber.imaginaryPart);
    double z = (this.realPart * otherNumber.imaginaryPart) + (this.imaginaryPart * otherNumber.realPart);
    return new Complex(c, z);
  }
  
  // chia hai so thuc
  public Complex divide(Complex otherNumber) {
    double denominator = Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2);
    double c = ((this.realPart * otherNumber.realPart) + (this.imaginaryPart * otherNumber.imaginaryPart)) / denominator;
    double z = ((this.imaginaryPart * otherNumber.realPart) - (this.realPart * otherNumber.imaginaryPart)) / denominator;
    return new Complex(c, z);
  }
    
    
    
    
}

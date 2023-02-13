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
    //nhap
    public void nhap(Scanner sc) {
        System.out.print("\tNhập vào phần thực: ");
        realPart = sc.nextDouble();
        System.out.print("\tNhập vào phần ảo: ");
        imaginaryPart = sc.nextDouble();
    }
    
    // cong hai so thuc
  public Complex add(Complex otherNumber) {
    double c = realPart + otherNumber.realPart;
    double z = imaginaryPart + otherNumber.imaginaryPart;
    return new Complex(c, z);
  }
  
  // tru hai so thuc
  public Complex subtract(Complex otherNumber) {
    double c = realPart - otherNumber.realPart;
    double z = imaginaryPart - otherNumber.imaginaryPart;
    return new Complex(c, z);
  }
  
  // nhan hai so thuc
  public Complex multiply(Complex otherNumber) {
    double c = (realPart * otherNumber.realPart) - (imaginaryPart * otherNumber.imaginaryPart);
    double z = (realPart * otherNumber.imaginaryPart) + (imaginaryPart * otherNumber.realPart);
    return new Complex(c, z);
  }
  
  // chia hai so thuc
  public Complex divide(Complex otherNumber) {
    double mauso = Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2);
    double c = ((realPart * otherNumber.realPart) + (imaginaryPart * otherNumber.imaginaryPart)) / mauso;
    double z = ((imaginaryPart * otherNumber.realPart) - (realPart * otherNumber.imaginaryPart)) / mauso;
    return new Complex(c, z);
  }

    @Override
    public String toString() {
        return (int)this.realPart+","+(int)this.imaginaryPart+"*i";
    }
    
    public void hienthi(){
       if(this.imaginaryPart <0){
            System.out.println(realPart + " - " + Math.abs(imaginaryPart) + "*i");
        }else{
             System.out.println(realPart + " + " + imaginaryPart + "*i");
        }
   }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT;

/**
 *
 * @author admin
 */
public class Book extends Author {
    public String title;
    public double price;

    public Book() {      
        super();
    }

    
    
    public Book(String title, double price, String firstname, String lastname) {
        super(firstname, lastname);
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "title= " + title +"\n"+
                "firstname=" + firstname + "\n"+
                "lastname=" + lastname + "\n"+
                "price=" + price;
    }

    

    

    
    
    
    
    
    
    
    
    
    
    
}

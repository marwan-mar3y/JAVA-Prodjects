/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
public class BookProduct extends product {
  private String author;
  private String publisher;

 public BookProduct(int productid, String name, double price, String author, String publisher) {
        super(productid, name, price);
        this.author = author;
        this.publisher = publisher; 
          }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
  
}

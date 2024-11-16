/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
public class product {
  private int productid;
  private String name;
  private double price;

  public product(int productId, String name, double price) {
        this.productid = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }
  
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
}

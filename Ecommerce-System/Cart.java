/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
public class cart {
  private int customerid;
  private int Nproduct;
  product [] products;
public cart(int customerid,int Nproduct){
    this.customerid=customerid;
    this.Nproduct=Nproduct;
    products= new product[this.Nproduct];
  }
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getNproduct() {
        return Nproduct;
    }

    public void setNproduct(int Nproduct) {
        this.Nproduct = Nproduct;
        products= new product[this.Nproduct];
    }
   public void addproduct(product n,int i){
       products[i]=n;
   }
 public void removeproduct(int i){
       products[i]=null;
   }  
public double calculatePrice() {
        double totalPrice = 0;
        for (product x : products) {
            if (x != null) {
                totalPrice += x.getPrice();
            }
        }
        return totalPrice;
    }
public void placeorder(){
    order O=new order(customerid, 1, products, calculatePrice());
   O.printOrderInfo();
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
public class order {
private int customerid;
    private int orderid;
    private product[] products;
    private double totalPrice;

    public order(int customerid, int orderid, product[] products, double total) {
        this.customerid =customerid;
        this.orderid =orderid;
        this.products = products;
        this.totalPrice = total;
         }
   public void printOrderInfo() {
        System.out.println("Order Information:");
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer ID: " + customerid);
        System.out.println("Products:");
        int i=1;
        for (product product : products) {
            if (product != null) {
                System.out.println(i+") "+ product.getName()+" -- "+product.getPrice()+"$");
               i++;
            }
        }
        System.out.println("Total Price: $" + totalPrice);
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
public class ClothingProduct extends product {
 private String size;
 private String fabric;

 public ClothingProduct(int productid, String name, double price, String size, String fabric) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
 }
 
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
 
}

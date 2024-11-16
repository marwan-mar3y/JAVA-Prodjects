/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
public  class  ElectronicProduct extends product{
  private String brand;
  private int warrantyPeriod;

  public ElectronicProduct(int productid, String name, double price, String brand, int warrantyPeriod) {
        super(productid, name, price);
        this.brand = brand;
        this.warrantyPeriod =warrantyPeriod;
    }
  
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod =warrantyPeriod;
    }
  
}
